<%--
  User: 1905096(진태양)
  Date: 2020-11-11
  Time: 오후 3:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>가감승제 계산기</title>
</head>
<body>
<center>
    <h3>가감승제 계산기</h3>
    <hr>
    <form action="/CalcServlet" name="form1" method="post">
        <input type="text" name="num1" width="200" size="5">
        <select name="operator" id="operator">
            <option value="+" selected>+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="text" name="num2" width="200" size="5">
        <input type="submit" value="계산" name="b1">
        <input type="reset" value="다시입력" name="b2">
    </form>
    <hr>
</center>
</body>
</html>
