<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-11-04
  Time: 오후 4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 회원인증 사용자 아이디와 암호
    String UserID = "kdhong";
    String UserPW = "1234";
    String UserName = "홍길동";

    if (UserID.equals(request.getParameter("id")) &&
    UserPW.equals(request.getParameter("pw"))) {
        // 회원인증 성공시 세션키 생성
        session.setAttribute("uName", UserName);
        response.sendRedirect("ex09-06-2.jsp");
    }else {
        // 회원인증 실패시 로그인 화면으로 복귀
        response.sendRedirect("ex09-06.jsp");
    }
%>
</body>
</html>
