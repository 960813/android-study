<%--
  Created by IntelliJ IDEA.
  File: ex05-03.jsp
  User: 1905096(진태양)
  Date: 2020-09-23
  Time: 오후 6:15
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         buffer="10kb"
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>out 내장객체 예제</title>
</head>
<body>
<h4>out 내장객체 예제</h4>
<%
    int total = out.getBufferSize();
    int unused = out.getRemaining();
    out.println("출력버퍼 크기: " + total + "Byte<br>");
    out.println("이용가능 버퍼: " + unused + "Byte<br>");
    out.println("　사용한 버퍼: " + (total - unused) + "Byte<br>");
%>
</body>
</html>
