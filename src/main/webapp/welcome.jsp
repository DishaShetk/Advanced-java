<%@ page language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    // Get name from form
    String name = request.getParameter("username");

    // Create session and store name
    session.setAttribute("user", name);

    // Set session expiry time = 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>

<p>Your session will expire in 1 minute.</p>

<a href="check.jsp">Check Session Status</a>

</body>
</html>