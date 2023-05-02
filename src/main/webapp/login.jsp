<%--
  Created by IntelliJ IDEA.
  User: austinjoiner
  Date: 5/2/23
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<h1>Login</h1>
<form method="post" action="login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <input type="submit" value="Submit">
</form>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && password != null && username.equals("admin") && password.equals("password")) {
        response.sendRedirect("profile.jsp");
    } else if (username != null || password != null) {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
