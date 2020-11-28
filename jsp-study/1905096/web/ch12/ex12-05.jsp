<%--
  User: 1905096(진태양)
  Date: 2020-11-25
  Time: 오후 2:09
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    Cookie cookie = new Cookie("MyCookie", "admin");
    cookie.setMaxAge(60*60);
    response.addCookie(cookie);
%>
<h4>EL Cookie 내장객체 예제</h4>
MyCookie 쿠키 값: ${cookie.MyCookie.value} <br>
MyCookie 쿠키 값: ${cookie['MyCookie']['value']} <br>
MyCookie 유지시간: ${cookie['MyCookie']['maxAge']} <br>
MyCookie 쿠키: ${cookie.MyCookie} <br>