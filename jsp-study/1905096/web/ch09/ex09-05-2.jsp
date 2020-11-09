<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-11-04
  Time: 오후 4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String session_id = session.getAttribute("id").toString();
    String session_pw = session.getAttribute("pw").toString();

    out.println("<h4> 세션 값을 얻어오는 예제 </h4>");
    out.println("<hr>");
    out.println("얻어온 세션 값은 다음과 같습니다.");
    out.println("<hr>");

    out.println("설정된 세션 값 [1] =>" +session_id + "<br><br>");
    out.println("설정된 세션 값 [2] =>" +session_pw + "<hr>");
%>
</body>
</html>
