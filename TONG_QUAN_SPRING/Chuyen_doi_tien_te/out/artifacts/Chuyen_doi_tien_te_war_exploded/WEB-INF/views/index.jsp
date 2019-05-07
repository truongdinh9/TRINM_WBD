<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 18/04/2019
  Time: 08:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/convert" method="post">
    <label>VN</label>
    <input type="text" name="e" value="${vn}"/><br/>
    <label>USD</label>
    <input type="text" readonly value="${usd}">
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
