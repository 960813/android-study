<%--
  Created by IntelliJ IDEA.
  File: ex07-03.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 10:39
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>수정폼</title>
    <script>
        function In_Check() {
            if (document.idform.dept_id.value === "") {
                alert("학과코드를 입력하세요!!!");
                return;
            }
            document.idform.submit();
        }
    </script>
</head>
<body>
<center>
    <h4>수정할 학과코드를 입력하세요</h4>
    <form action="ex07-03-1.jsp" method="post" name="idform">
        <table width="200" border="1" cellspacing="0" cellpadding="5">
            <tr>
                <td align="center">학과코드</td>
                <td><input type="text" name="dept_id" size="10"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="button" name="modify" value="수정" onclick="In_Check()">
                    <input type="reset" value="취 소">
                </td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
