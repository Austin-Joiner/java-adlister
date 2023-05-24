<%--
  Created by IntelliJ IDEA.
  User: austinjoiner
  Date: 5/8/23
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>View Color</title>
    <style>
        body {
            background-color: <%= request.getAttribute("color") %>;
        }
    </style>
</head>
<body>
<h1>Your Favorite Color</h1>
<p>You picked the color <%= request.getAttribute("color") %>.</p>
</body>
</html>
