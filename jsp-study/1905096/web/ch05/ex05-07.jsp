<%--
  Created by IntelliJ IDEA.
  File: ex05-07.jsp
  User: 1905096(진태양)
  Date: 2020-09-23
  Time: 오후 7:11
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         errorPage="error.jsp"
%>
<% String alpha[] = {"A", "B", "C"}; %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>exception 내장객체 예제</title>
</head>
<body>
<h4>Exception 내장객체 예제</h4>
1번째 배열: <%=alpha[1]%>
error: <%=alpha[3]%>
</body>
</html>
