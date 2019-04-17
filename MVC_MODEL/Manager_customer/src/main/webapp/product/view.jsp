<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 16/04/2019
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<p>
    <a href="/products">Back to list</a>
</p>
<form method="post">
    <fieldset>
        <legend>View product</legend>
        <table>
            <tr>
                <td>Name</td>
                <td>${product.getProduct_name()}</td>
            </tr>
            <tr>
                <td>Date</td>
                <td>${product.getNsx()}</td>
            </tr>
            <tr>
                <td>Price</td>
                <td>${product.getPrice()}</td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

