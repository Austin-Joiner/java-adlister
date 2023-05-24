<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: austinjoiner
  Date: 5/24/23
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <div class="container">
            <h1>Title of Ad: ${ad.title}</h1>
            <p>Users ID: ${ad.userId}</p>
            <p>Content: ${ad.description}</p>
        </div>
    </div>
</c:forEach>
</body>
</html>
