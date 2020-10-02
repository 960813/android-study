<%--
  Created by IntelliJ IDEA.
  File: ex06-01.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 5:19
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>로그인 입력 폼</title>
</head>
<body>
<center>
    로그인 입력 화면
    <form action="ex06-02.jsp" method="post">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id" size="15"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="pw" size="17"></td>
            </tr>
            <tr align="center">
                <td colspan="4">
                    <input type="submit" value="로그인">
                    <input type="reset" value="취  소">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
