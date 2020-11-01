<%--
  Created by IntelliJ IDEA.
  File: ex08-04.jsp
  User: 1905096(진태양)
  Date: 2020-11-01
  Time: 오후 9:23
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>;
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>jsp:forward & jsp:param 태그 예제</title>
</head>
<body bgcolor="red">
<h4>jsp:forward와 jsp:param 태그에 대한 예제</h4>
<hr>
이 파일은 ex08-04.jsp 입니다. 배경색은 빨간색 입니다.
<jsp:forward page="ex08-04-1.jsp">
    <jsp:param name="url" value="http://localhost:8080/ch08/ex08-04-1.jsp"/>
    <jsp:param name="memo" value="JSP/Servlet 마스터하여 웹프로그래머 되자!!! "/>
</jsp:forward>
</body>
</html>
