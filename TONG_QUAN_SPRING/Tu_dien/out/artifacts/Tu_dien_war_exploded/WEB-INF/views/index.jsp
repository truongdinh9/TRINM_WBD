<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 18/04/2019
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/dictionary" method="post">
    <input type="text" name="search" value="${search}" />
    <input type="text" value="${stringArrayList}"/>
    <input type = "submit"  value = "Search"/>
  </form>
  </body>
</html>
