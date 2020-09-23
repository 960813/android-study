<%--
  Created by IntelliJ IDEA.
  File: ex05-04-1.jsp
  User: 1905096(진태양)
  Date: 2020-09-23
  Time: 오후 6:37
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>session 내장객체 예제(2)</title>
</head>
<body>
<h4>session 내장객체(2)</h4>
당신의 세션 ID는
<%=session.getAttribute("id")%> 입니다. <br>
</body>
</html>
