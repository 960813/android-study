<%--
  User: 1905096(진태양)
  Date: 2020-12-02
  Time: 오후 2:09
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>JSTL fmt: formatNumber Tag</title>
</head>
<body>
<c:set var="num1" value="12345678.1234"/>
<table border="1">
    <tr>
        <th colspan="4">숫자형식 변환 예제</th>
    </tr>
    <tr align="center">
        <td colspan="2">숫자 데이터 ==></td>
        <td colspan="2">${num1}</td>
    </tr>
    <tr>
        <td>1. 화폐 타입</td>
        <td><fmt:formatNumber value="${num1}" type="currency"/></td>
        <td>2. USA 화폐</td>
        <td>
            <fmt:setLocale value="en_US"/>
            <fmt:formatNumber value="${num1}" type="currency"/>
        </td>
    </tr>
    <tr>
        <td>3. 정수 3자리</td>
        <td>
            <fmt:formatNumber type="number" maxIntegerDigits="3" value="${num1}"/>
        </td>
        <td>4. 소수점 3자리</td>
        <td>
            <fmt:formatNumber type="number" maxFractionDigits="3" value="${num1}"/>
        </td>
    </tr>
    <tr>
        <td>5. 3자리 퍼센트</td>
        <td>
            <fmt:formatNumber type="percent" maxIntegerDigits="3" value="${num1}"/>
        </td>
        <td>6. 10자리 퍼센트</td>
        <td>
            <fmt:formatNumber type="percent" maxFractionDigits="10" value="${num1}"/>
        </td>
    </tr>

    <tr>
        <td>7. 그룹분리 타입</td>
        <td>
            <fmt:formatNumber type="number" groupingUsed="false" value="${num1}"/>
        </td>
        <td>8. 지수 타입</td>
        <td>
            <fmt:formatNumber type="number" pattern="#.###E0" value="${num1}"/>
        </td>
    </tr>

    <tr>
        <td>9. 한국 화폐</td>
        <td>
            <fmt:setLocale value="ko_KR"/>
            <fmt:formatNumber type="currency" value="${num1}"/>
        </td>
        <td>10. 일본 화폐</td>
        <td>
            <fmt:setLocale value="ja_JP"/>
            <fmt:formatNumber type="currency" value="${num1}"/>
        </td>
    </tr>
</table>

</body>
</html>
