<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: minhtri
  Date: 11/04/2019
  Time: 05:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple </title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello", "Xin chao");
    dic.put("how", "The nao");
    dic.put("book", "Quyen vo");
    dic.put("computer", "May tinh");

    String search = request.getParameter("search");

    String rs = dic.get(search);
    if (rs != null) {
        out.println("Work: " + search);
        System.out.println("Result: " + rs);
    } else {
        out.println("Not found");
    }
%>
</body>
</html>
