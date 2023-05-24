<%--
  Created by IntelliJ IDEA.
  User: austinjoiner
  Date: 5/8/23
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <h1>Pick Your Color!</h1>
    <form action="PickColorServlet" method="post">
        <label for="color">Type Your Color</label>
        <input type="text" id="color" name="color">
        <input type="submit" value="Submit Me">
    </form>
</body>
</html>
