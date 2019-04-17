<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 16/04/2019
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create product</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Date</td>
        <td>Price</td>
        <td>Update</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="rows" items='${listProduct}'>
        <tr>
            <td><a href="/products?action=view&id=${rows.getProduct_id()}">${rows.getProduct_name()}</a></td>
            <td>${rows.getNsx()}</td>
            <td>${rows.getPrice()}</td>
            <td><a href="/products?action=update&id=${rows.getProduct_id()}">Update</a></td>
            <td><a href="/products?action=delete&id=${rows.getProduct_id()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
