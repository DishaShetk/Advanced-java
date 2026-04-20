<%@ page language="java" %>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2>Session Expired!</h2>
<%
    } else {
%>
        <h2>Hello <%= user %>! Session is still active.</h2>
<%
    }
%>

</body>
</html>