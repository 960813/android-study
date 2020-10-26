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
            if (document.courseinput.course_id.value === "") {
                alert("과목코드를 입력하세요!!!");
                return;
            }
            if (document.courseinput.title.value === "") {
                alert("과목명을 입력하세요!!!");
                return;
            }
            if (document.courseinput.c_number.value === "") {
                alert("학점수를 입력하세요!!!");
                return;
            }
            document.courseinput.submit();
        }
    </script>
</head>
<body>
<center>
    <h3>개설 과목 입력 화면</h3>
    <form action="app07-02-1.jsp" method="post" name="courseinput">
        <table border="1" cellspacing="1">
            <tr>
                <td>과목 코드 :</td>
                <td><input type="text" name="course_id"></td>
            </tr>
            <tr>
                <td>과 목 명 :</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>학 점 수 :</td>
                <td><input type="text" name="c_number"></td>
            </tr>
            <tr>
                <td>담당교수번호 :</td>
                <td><input type="text" name="professor_id"></td>
            </tr>
            <tr>
                <td>추가수강료 :</td>
                <td><input type="text" name="course_fees"></td>
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
