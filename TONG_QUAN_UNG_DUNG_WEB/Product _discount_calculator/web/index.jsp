<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 11/04/2019
  Time: 05:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="./pay" method="post">
    <label>Product Description:</label><br/>
    <input type="text" name="listProduct"/><br/>
    <label>Price:</label><br/>
    <input type="number" name="price"/><br/>
    <label>Discount Percent:</label><br/>
    <input type="number" name="discountPercent"/><label>(%)</label><br/>
    <input type="submit" id="submit" value="Discount Calculator"/>

</form>
</body>
</html>
