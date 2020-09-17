<%--
  Created by IntelliJ IDEA.
  File: ex04-04.jsp
  User: 1905096(진태양)
  Date: 2020-09-17
  Time: 오후 10:59
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>스크립트릿을 이용한 구구단</title>
</head>
<style>
    table {
        text-align: center;
    }

    tr:nth-child(1) {
        font-weight: bold;
        font-size: 1.5rem;
    }

    tr > td:nth-child(2n) {
        background-color: #ffad2e;
    }

    tr > td:nth-child(2n + 1) {
        background-color: #0059c6;
        color: white;
    }
</style>
<body>
<center>
    <h4>스크립트릿을 이용한 구구단</h4>
    <table border="1" cellspacing="2">
        <%-- 변수 선언 --%>
        <%
            int i, j, k;
        %>
        <%-- 구구단 '단' 출력 --%>
        <tr>
            <%
                for (i = 2; i <= 9; i++) {
            %>
            <td>
                <%
                    out.println(i + "단");
                %>
            </td>
            <%
                }
            %>
        </tr>
        <%-- 구구단 본문 출력 --%>
        <%
            for (i = 1; i <= 9; i++) {
        %>
        <tr>
            <%
                for (j = 2; j <= 9; j++) {
                    k = i * j;
            %>
            <td>
                <%
                    out.println(j + " * " + i + " = " + k);
                %>
            </td>
            <%
                }
                // 아래 코드는 불필요한 것으로 판단됨.
                out.println("<p>");
            %>
        </tr>
        <%
            }
        %>
    </table>
</center>
</body>
</html>
