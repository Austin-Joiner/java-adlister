<%--
  Created by IntelliJ IDEA.
  User: austinjoiner
  Date: 5/8/23
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<div class="container">
    <h1>Crust</h1>
    <form action="pizza-order" method="POST">
        <div class="form-group">
            <h3 for="crust">Crust</h3>
            <select name="crust">
                <option value="butter">Butter</option>
                <option value="cajun">Cajun</option>
                <option value="garlic">Garlic</option>
            </select>
        </div>

        <div class="form-group">
            <h3 for="sauce">Sauce</h3>
            <select name="sauce">
                <option value="original">Original</option>
                <option value="buffalo">Buffalo</option>
                <option value="white">White</option>
            </select>
        </div>

        <div class="form-group">
            <h3 for="size">Size</h3>
            <select name="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
        </div>

        <div class="form-group">
            <h3 for="toppings">Toppings</h3>
            <input type="checkbox" id="toppings" name="toppings" value="pepperoni">
            <label for="toppings">Pepperoni</label><br>
            <input type="checkbox" id="toppings2" name="toppings" value="mushroom">
            <label for="toppings2">Mushroom</label><br>
            <input type="checkbox" id="toppings3" name="toppings" value="Jalapeno">
            <label for="toppings3">Jalapeno</label><br>
        </div>

        <label for="delivery">Delivery Address: </label>
        <input type="text" name="delivery" id="delivery">

        <input type="submit" class="btn btn-primary btn-block" value="order">
    </form>
</div>


</body>
</html>
