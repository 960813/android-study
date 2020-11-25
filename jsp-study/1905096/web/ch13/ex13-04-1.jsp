<%--
  Created by IntelliJ IDEA.
  File: ex06-04.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 6:42
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- request 인코딩 변경 --%>
<% request.setCharacterEncoding("UTF-8"); %>

<h4>성별과 좋아하는 과목은</h4>

당신은 <b>${param.sex}</b>이고, <br><br> 좋아하는 과목으로 <br><b>
    <c:forEach var="ck" items="${paramValues.subj}">
        - ${ck}<br>
    </c:forEach>
</b>
<br>을 선택하였습니다.