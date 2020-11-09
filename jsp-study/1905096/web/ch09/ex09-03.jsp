<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-11-04
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
import="java.text.DateFormat, java.util.Date"%>
<%
    Cookie lastDate = null;
    String msg = "";
    boolean found = false;
    String newValue = "" + System.currentTimeMillis();

    // 쿠키를 얻는다
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for(int i=0;i<cookies.length;i++) {

        }
    }

    // 처음 방문일 경우 새 쿠키 생성
    if (!found) {
        msg = "처음 방문입니다....";
        lastDate = new Cookie("MyCookie1", newValue);
        lastDate.setMaxAge(7 * 24 * 60 * 60); // 7일
        response.addCookie(lastDate);
    } else {
        long conv = new Long(lastDate.getValue()).longValue();
        msg = "당신의 마지막 방문 : " + new Date(conv);

        // 쿠키에 새 값을 추가
        lastDate.setValue(newValue);
        lastDate.setMaxAge(7*24*60*60);
        response.addCookie(lastDate);
    }
    out.println(msg);
%>
<html>
<head>
    <title></title>
</head>
<body>

</body>
</html>
