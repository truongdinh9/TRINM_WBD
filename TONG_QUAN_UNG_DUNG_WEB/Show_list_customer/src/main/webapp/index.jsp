
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.invoke.SerializedLambda" %>
<%@ page import="com.code.model.Customer" %>
<%@ page import="com.code.respository.impl.CustomerImplement" %>
<%--
<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 11/04/2019
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div>
    <%
        CustomerImplement customerImplement = new CustomerImplement();
        request.setAttribute("list",customerImplement.lisCustomers());
    %>

    <table>
        <tr>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Inmage</th>
        </tr>
        <c:forEach var="rows" items="${list}">

            <tr>
                <td>${rows.getName()}</td>
                <td>${rows.getBirthday()}</td>
                <td>${rows.getAddress()}</td>
                <td>${rows.getInmage()}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>