<%--
  Created by IntelliJ IDEA.
  File: 1905096_hb_input.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 11:53
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>성적조회를 위한 입력화면</title>
    <script>
        function In_Check() {
            if (document.deptinput.Student_ID.value === "") {
                alert("학번을 입력하세요!!!");
                return;
            }
            document.deptinput.submit();
        }
    </script>
    <style>
        body {
            background-color: #c1dbff;
        }

        table {
            background-color: white;
        }

        h3 {
            font-style: italic;
        }
    </style>
</head>
<body>
<center>
    <h3>1905096 - 진태양</h3>
    <h4>조회할 학번을 입력하세요.</h4>
    <form action="1905096_hb_view.jsp" method="post" name="deptinput">
        <table border="1" cellspacing="1">
            <tr>
                <td><font size="2">학 번</font></td>
                <td><input type="text" name="Student_ID"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="button" name="confirm" value="조 회" onclick="In_Check()">
                    <input type="reset" name="reset" value="취 소">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
