<%--
  User: 1905096(진태양)
  Date: 2020-12-02
  Time: 오후 3:02
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource
        driver="oracle.jdbc.driver.OracleDriver"
        url="jdbc:oracle:thin:@oracle12.cwdeh862c8nr.ap-northeast-2.rds.amazonaws.com:15211:ORCL"
        user="y1905096" password="pass1905096" var="ds1" scope="page"/>

<sql:query var="rs" dataSource="${ds1}">
    select course_id, title, c_number, nvl(course_fees, 0) "fee"
    from course
    where c_number = 3
</sql:query>

<center>
    <h4>Course 테이블 조회</h4>
    <table border="1" align="center">
        <tr>
            <th>번호</th>
            <th>과목코드</th>
            <th>과목명</th>
            <th>학점</th>
            <th>추가수강료</th>
        </tr>
        <c:forEach var="row" items="${rs.rows}" varStatus="status">
            <tr>
                <td align="center">${status.count}</td>
                <td align="center">${row.course_id}</td>
                <td>${row.title}</td>
                <td align="center">${row.c_number}</td>
                <td align="center">${row.fee}</td>
            </tr>
        </c:forEach>
    </table>
</center>