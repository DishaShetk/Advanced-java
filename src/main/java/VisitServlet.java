import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/visit")
public class VisitServlet extends HttpServlet {

    // Handle POST request (form submission)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 0;
        boolean found = false;

        // Get existing cookies
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    found = true;
                }
            }
        }

        // Update visit count
        visitCount = found ? visitCount + 1 : 1;

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Display result
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        // Display cookies AFTER adding
        out.println("<h3>Active Cookies:</h3>");
        Cookie[] updatedCookies = request.getCookies();

        if (updatedCookies != null) {
            for (Cookie c : updatedCookies) {
                out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><p>Cookies will expire in 60 seconds.</p>");
        out.println("</body></html>");
    }

    // FIX FOR 405 ERROR (GET request handling)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Redirect to form page
        response.sendRedirect("index.html");
    }
}