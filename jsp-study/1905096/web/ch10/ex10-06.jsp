<%--
  User: 1905096(진태양)
  Date: 2020-11-11
  Time: 오후 3:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>simpleController 예제(1)</title>
</head>
<body>
<h4>simpleController 예제(1)</h4>
<%=request.getParameter("year")%> 년제 재학중이면, <br>
<%=request.getAttribute("result")%>
</body>
</html>
