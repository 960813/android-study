<%--
  Created by IntelliJ IDEA.
  File: ex08-02-1.jsp
  User: 1905096(진태양)
  Date: 2020-11-01
  Time: 오후 7:33
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="ch08.LoginBean" %>
<jsp:useBean id="test" class="ch08.LoginBean" scope="page"/>
<jsp:setProperty name="test" property="id"/>
<jsp:setProperty name="test" property="pw"/>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login 자바빈 예제</title>
</head>
<body>
<h4>로그인 정보</h4>
아 이 디 :
<jsp:getProperty name="test" property="id"/>
<p></p>
비밀번호 :
<jsp:getProperty name="test" property="pw"/>
<p></p>

</body>
</html>
