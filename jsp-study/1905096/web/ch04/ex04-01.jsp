<%--
  Created by IntelliJ IDEA.
  File: ex04-01.jsp
  User: 1905096(진태양)
  Date: 2020-09-17
  Time: 오전 12:18
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.util.Date, java.text.SimpleDateFormat"
%>
<%
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>page 지시어 예제</title>
</head>
<body>
Today is : <%= date %> <br>
오늘은 : <%= simpleDateFormat.format(date)%> 입니다. <br>
<br>
1905096(진태양)
</body>
</html>
