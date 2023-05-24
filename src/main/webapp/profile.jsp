<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <form action="logout" method="post">
        <button type="submit">Logout</button>
    </form>

    <h2>HELLO, ${sessionScope.user}, I HOPE YOUR DAY IS GOING WELL!</h2>


    <div class="container">
        <h2>Viewing your profile.</h2>
    </div>

</body>
</html>
