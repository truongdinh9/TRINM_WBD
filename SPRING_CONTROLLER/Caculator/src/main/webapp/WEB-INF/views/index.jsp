<%--
  Created by IntelliJ IDEA.
  User: tri
  Date: 29/04/2019
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
<form action="/" method="post" >
  <input type="text" name="numberOne" value="${numberOne}"/> <br>
  <input type="text" name="numberTwo" value="${numberTwo}"> <br>
  <button type="submit" name="btnAddition">Addition(+)</button>
  <button type="submit" name="btnSubtration">Subtration(-)</button>
  <button type="submit" name="btnMultiplication">Multiplication(X)</button>
  <button type="submit" name="btnDivision">Division(/)</button>
</form>
  Result:
  <input type="text" name="result" value="${result}"/>
  </body>
</html>
