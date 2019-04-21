<%--
  Created by IntelliJ IDEA.
  User: Tri
  Date: 4/22/2019
  Time: 12:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      select{
        width: 200px;
        height: 20px;
      }
    </style>
  </head>
  <body>
  <h2>Current local times around the word</h2>
  <span>Current time in ${city}:<strong>${date}</strong></span>
  <form id="locale" action="/" method="get">
    <select name="city" onchange="document.getElementById('locale').submit()">
      <option value="Asia/HCM">Select a city</option>
      <option value="Asia/HCM"  >Ho Chi Minh</option>
      <option value="Singapore" selected>Singapore</option>
      <option value="Asia/Hong_Kong">Hong Kong</option>
      <option value="Asia/Tokyo">Tokyo</option>
      <option value="Asia/Seoul">Seoul</option>
      <option value="Europe/London">London</option>
      <option value="Europe/Madrid">Madrid</option>
      <option value="America/New_York">New York</option>
      <option value="Australia/Sydney">Sydney</option>
      <option value="Argentina/Buenos_Aires">Buenos Aires</option>
    </select>
  </form>
  </body>
</html>
