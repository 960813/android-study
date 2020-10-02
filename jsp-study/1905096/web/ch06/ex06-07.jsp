<%--
  Created by IntelliJ IDEA.
  File: ex06-07.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 7:18
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>유효성 검사</title>
    <script lang="javascript">
        function In_Check() {
            if (document.login.id.value == "") {
                alert("아이디(ID)를 입력하세요!!!");
                return;
            }
            if (document.login.pw.value == "") {
                alert("비밀번호를 입력하세요!!!");
                return;
            }

            document.login.submit();
        }
    </script>
</head>
<body>
<center>
    로그인 입력 화면
    <form action="ex06-02.jsp" method="post" name="login">
        <table border="1" cellspacing="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id" size="15"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="pw" size="17"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="button" value="로그인" onclick="In_Check()">
                    <input type="reset" value="취  소">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
