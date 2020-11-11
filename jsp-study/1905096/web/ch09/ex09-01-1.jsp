<%--
  User: 1905096(진태양)
  Date: 2020-11-11
  Time: 오후 1:43
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String id = request.getParameter("id");
    String passwd = request.getParameter("pw");
    boolean found = false;
    Cookie[] cookies = request.getCookies();

    for (int i = 0; i < cookies.length; i++) {
        if (cookies[i].getName().equals("MyCookie")) {
            found = true;
            break;
        }
    }

    if (!found) {
        Cookie cookie = new Cookie("MyCookie", id);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
        out.println("쿠키를 최초로 설정합니다.<br>");
    } else {
        out.println("쿠키가 설정되어 있습니다.");
    }
%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>쿠키 설정 예제</title>
</head>
<body>
<h4>로그인 정보</h4>
로 그 인 : <%=id%> <br>
비 밀 번 호 : <%=passwd%> <br>
쿠키헤더: <%=request.getHeader("Cookie")%>
</body>
</html>