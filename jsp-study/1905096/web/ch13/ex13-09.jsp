<%--
  User: 1905096(진태양)
  Date: 2020-11-25
  Time: 오후 4:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h4>url 태그 예제</h4>
<c:url var="url1" value="https://www.google.co.kr/"/>
<c:url var="url2" value="http://localhost:8080/ch13/logo.jsp"/>
<c:url var="url3" value="http://localhost:8080/login.jsp">
    <c:param name="id" value="jskang"/>
</c:url>
<c:redirect url="${url1}"/>
<ul>
    <li>url1 = ${url1}</li>
    <li>url2 = ${url2}</li>
    <li>url3 = ${url3}</li>
</ul>