<%--
  Created by IntelliJ IDEA.
  File: ex06-06.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 7:01
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<%-- 한글 인코딩 관련 코드 추가 --%>
<%request.setCharacterEncoding("UTF-8");%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>배열로 전송된 값 처리</title>
</head>
<body>
<h4>당신이 보고 싶은 영화제목으로 선택한 것은 ? </h4>
<%
    String[] movies = request.getParameterValues("movie");
    for (int i = 0; i < movies.length; ++i) {
%>
        <%=i + 1%>.
        <%=movies[i]%> <br>
<% }%>

</body>
</html>
