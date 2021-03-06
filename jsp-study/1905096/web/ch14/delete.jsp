<%--
  User: 1905096(진태양)
  Date: 2020-12-09
  Time: 오후 2:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<c:set var="id" value="${uid}" scope="session"/>
<c:if test="${id==null}"><c:redirect url="login.jsp"/></c:if>
<sql:update dataSource="jdbc/OracleDB">
    delete from member where m_uid = ?
    <sql:param value="${id}"/>
</sql:update>

<c:remove var="uid" scope="session"/>
<c:out value="회원을 탈퇴하였습니다."/> <p></p>
<c:url value="img/delete.gif" var="img1"/>
<img src="${img1}" width="100" height="100">