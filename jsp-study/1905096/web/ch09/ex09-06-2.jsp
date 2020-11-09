<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-11-04
  Time: 오후 4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 로그인 유무 확인
    String checkName = null;
    checkName = (String) session.getAttribute("uName");

    if (checkName == null) {
        response.sendRedirect("ex09-06.jsp");
    }
%>
<html>
<head>
    <title>로그인 성공 처리 예제</title>
</head>
<body>
<%=checkName%> 님 안녕하세요!<br>
<a href="https://google.co.kr/">[Google]</a>로 이동하려면 [Google]을 클릭하세요!!!
</body>
</html>
