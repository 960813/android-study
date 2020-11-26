<%--
  Created by IntelliJ IDEA.
  File: ex07-02.jsp
  User: 1905096(진태양)
  Date: 2020-10-15
  Time: 오후 8:09
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>테이블 행 추가 폼</title>
    <script>
        function In_Check() {
            if (document.deptinput.dept_id.value === "") {
                alert("학과 코드를 입력하세요!!!");
                return;
            }
            if (document.deptinput.dept_name.value === "") {
                alert("학과명을 입력하세요!!!");
                return;
            }
            document.deptinput.submit();
        }
    </script>
</head>
<body>
<center>
    <h3>학과 정보 입력 화면</h3>
    <form action="app11-02-1.jsp" method="post" name="deptinput">
        <table border="1" cellspacing="1">
            <tr>
                <td>학과 코드 :</td>
                <td><input type="text" name="dept_id"></td>
            </tr>
            <tr>
                <td>학 과 명 :</td>
                <td><input type="text" name="dept_name"></td>
            </tr>
            <tr>
                <td>전화번호 :</td>
                <td><input type="text" name="dept_tel"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="button" onclick="In_Check()" name="confirm" value="등 록">
                    <input type="reset" value="취 소" name="reset">
                </td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
