<%--
  User: 1905096(진태양)
  Date: 2020-11-18
  Time: 오후 3:22
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>교수번호 입력 화면</title>
    <script lang="javascript">
        function In_Check() {
            if (!document.proinput.professor_id.value) {
                alert("담당교수를 입력하세요!!!");
                return;
            }
            document.proinput.submit();
        }
    </script>
</head>
<body>
<center>
    <h4>교수별 개설과목 조회 입력 화면</h4>
    <form action="ex11-05-1.jsp" method="post" name="proinput">
        <table border="1" cellspacing="1">
            <tr>
                <td>조회할 담당교수번호 :</td>
                <td><input type="text" name="professor_id" size="5"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="button" name="confirm" value="조회" onclick="In_Check()">
                    <input type="reset" name="reset" value="취  소">
                </td>
            </tr>
        </table>
    </form>
</center>

</body>
</html>
