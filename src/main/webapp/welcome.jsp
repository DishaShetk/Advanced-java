<%@ page import="java.util.*" %>

<%
    // Set session timeout to 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);

    String username = request.getParameter("username");

    if (username != null) {
        session.setAttribute("username", username);
    } else {
        username = (String) session.getAttribute("username");
    }

    if (username == null) {
        username = "Guest";
    }

    Integer visitCount = (Integer) session.getAttribute("visitCount");

    if (visitCount == null) {
        visitCount = 1;
    } else {
        visitCount++;
    }

    session.setAttribute("visitCount", visitCount);

    Date creationTime = new Date(session.getCreationTime());
    Date lastAccessTime = new Date(session.getLastAccessedTime());
%>

<html>
<head>
    <title>Session Info</title>
</head>
<body>

<h2>Hello <%= username %>!</h2>

<p><b>Session ID:</b> <%= session.getId() %></p>
<p><b>Session Creation Time:</b> <%= creationTime %></p>
<p><b>Last Access Time:</b> <%= lastAccessTime %></p>
<p><b>Visit Count:</b> <%= visitCount %></p>

<p style="color:red;">
    Session will expire after 1 minute of inactivity.
</p>

</body>
</html>