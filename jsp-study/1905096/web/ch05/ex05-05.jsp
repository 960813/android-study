<%--
  Created by IntelliJ IDEA.
  File: ex05-05.jsp
  User: 1905096(진태양)
  Date: 2020-09-23
  Time: 오후 7:01
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>application 내장객체 예제</title>
</head>
<body>
<h4>application 내장객체 예제</h4>
<%
    String serverInfo = application.getServerInfo();
    String realPath = application.getRealPath("/");
%>
Server: <%= serverInfo%> <br>
Path of Document: <%=realPath%>

</body>
</html>
