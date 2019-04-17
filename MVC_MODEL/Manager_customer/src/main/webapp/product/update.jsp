<%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 16/04/2019
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <p>
        <a href="/products">Back to list</a>
    </p>
<form method="post">
   <fieldset>
       <legend>Update product</legend>
       <table>
           <tr>
               <td>Name</td>
               <td><input type="text" name="name" value="${product.getProduct_name()}"/></td>
           </tr>
           <tr>
               <td>Date</td>
               <td><input type="text" name="nsx" value="${product.getNsx()}"/></td>
           </tr>
           <tr>
               <td>Price</td>
               <td><input type="text" name="price" value="${product.getPrice()}"/></td>
           </tr>
           <tr>
               <td></td>
               <td><input type="submit" value="Update prduct"/></td>
           </tr>
       </table>
   </fieldset>
</form>
</body>
</html>
