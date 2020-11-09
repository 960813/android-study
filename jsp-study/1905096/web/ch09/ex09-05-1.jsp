<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-11-04
  Time: 오후 4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>세션 값을 설정하는 예제</h4>
<hr>세션 값을 설정하는 페이지 입니다.
<%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");

    session.setAttribute("id", id);
    session.setAttribute("password", pw);
%>
<hr> 설정된 세션 값을 얻어오려면
<a href="ex09-05-2.jsp">여기 </a>를 클릭하세요.
<hr>
</body>
</html>
