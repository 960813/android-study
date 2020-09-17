<%--
  Created by IntelliJ IDEA.
  File: ex04-05.jsp
  User: 1905096(진태양)
  Date: 2020-09-17
  Time: 오후 11:35
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.util.Date, java.text.SimpleDateFormat"
%>
<%
    /* Date 객체 생성 및 날짜 출력 형식 지정 */
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
%>
<!-- HTML 컨텐트 주석문 입니다. -->
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>page 지시어 예제</title>
</head>
<body>
<%-- 날짜와 시간을 출력 --%>
Today is : <%= date %> <br>
오늘은 : <%= simpleDateFormat.format(date)%> 입니다. <br>
<br>
1905096(진태양)
</body>
</html>
