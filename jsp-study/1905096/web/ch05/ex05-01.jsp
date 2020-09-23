<%--
  Created by IntelliJ IDEA.
  File: ex05-01.jsp
  User: 1905096(진태양)
  Date: 2020-09-23
  Time: 오후 3:01
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>request 내장객체 예제</title>
</head>
<body>
<center>
    <h3>request 내장객체를 사용한 예제</h3>
    <table border="1">
        <tr>
            <td>요청 메서드:</td>
            <td><%=request.getMethod()%>
            </td>
        </tr>
        <tr>
            <td>요청 URL:</td>
            <td><%=request.getRequestURL()%>
            </td>
        </tr>
        <tr>
            <td>프로토콜 종류:</td>
            <td><%=request.getProtocol()%>
            </td>
        </tr>
        <tr>
            <td>Server의 이름:</td>
            <td><%=request.getServerName()%>
            </td>
        </tr>
        <tr>
            <td>Server Port 번호:</td>
            <td><%=request.getServerPort()%>
            </td>
        </tr>
        <tr>
            <td>사용자 컴퓨터의 IP 주소:</td>
            <td><%=request.getRemoteAddr()%>
            </td>
        </tr>
        <tr>
            <td>사용자 컴퓨터의 이름:</td>
            <td><%=request.getRemoteHost()%>
            </td>
        </tr>
    </table>
</center>

</body>
</html>
