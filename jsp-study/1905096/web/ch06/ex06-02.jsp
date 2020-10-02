<%--
  Created by IntelliJ IDEA.
  File: ex06-02.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 6:26
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>

<h3>로그인 입력 화면에서</h3>
전송된 아이디와 비밀번호는<br>
<%
    String id = request.getParameter("id");
    out.println(id);
%>
&nbsp;
<%=request.getParameter("pw")%>
&nbsp;입니다.

</body>
</html>
