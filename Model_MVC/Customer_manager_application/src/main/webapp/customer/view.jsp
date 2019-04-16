<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 16/04/2019
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<h1>Customer View</h1>
<p>
        <a href="/customers">Back to list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customer"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>>
        <td>${requestScope["customer"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>>
        <td>${requestScope["customer"].getAddress()}</td>
    </tr>
</table>
</body>
</html>
