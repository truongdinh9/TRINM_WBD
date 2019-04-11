<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 11/04/2019
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Simple cacuclate</h1>
<form method="post" action="./calculate">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand:</td>
                <td><input type="text" name="firstOperand"/></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Mulatiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand: </td>
                <td><input name="secondOperand" type="text"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Caculate"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
