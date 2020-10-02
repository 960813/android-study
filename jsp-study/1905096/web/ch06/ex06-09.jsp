<%--
  Created by IntelliJ IDEA.
  File: ex06-04.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 6:42
--%>
<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>--%>

<%-- request 인코딩 변경 --%>
<%--<% request.setCharacterEncoding("UTF-8"); %>--%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<h4>성별과 좋아하는 과목은</h4>

<%
    String sex = request.getParameter("sex");
    String[] subjects = request.getParameterValues("subj");
%>
당신은 <b><%=sex%>
</b>이고, <p></p>
좋아하는 과목으로 <br><b>
    <%
        for (String subject : subjects) {
            out.print(" - ");
            out.print(subject);
            out.print("<br>");
        }
    %>
</b>
<%=subjects.length%> 과목을 선택하셨군요.
</body>
</html>
