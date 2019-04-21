<%--
  Created by IntelliJ IDEA.
  User: Tri
  Date: 4/22/2019
  Time: 12:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>
    <%--@elvariable id="loginForm" type=""--%>
    <form:form action="/login" method="post" modelAttribute="loginForm">
      <fieldset>
      <legend>Login</legend>
        <table>
          <tr>
            <td><form:label path="account">Account</form:label></td>
            <td><form:input path="account"/></td>
          </tr>
          <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password"/></td>
          </tr>
          <tr>
            <td></td>
            <td><form:button>Login</form:button></td>
          </tr>
        </table>
      </fieldset>

    </form:form>
  </h3>
  </body>
</html>
