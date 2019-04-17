<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 16/04/2019
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create product</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>

<p>
    <a href="/products">Back to list</a>
</p>
<form  method="post">
    <fieldset>
        <legend>Create product</legend>
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Date</td>
                <td><input type="text" name="nsx"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" name="price"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
