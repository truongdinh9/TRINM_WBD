<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 15/04/2019
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<body>
        <h1>Create new customer</h1>
        <p>
            <c:if test='${requestScope["message"]!= null}'>
                <span class="message">${requestScope["message"]}</span>
            </c:if>
        </p>
        <p>
            <a href="/customers"> Back to customer list</a>
        </p>
        <form method="post">
            <fieldset>
                <legend>Customer information</legend>
                <table>
                    <tr>
                        <td>Name: </td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Email: </td>
                        <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                        <td>Address: </td>
                        <td><input type="text" name="address"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Create customer"></td>
                    </tr>
                </table>
            </fieldset>
        </form>
</body>
</html>
