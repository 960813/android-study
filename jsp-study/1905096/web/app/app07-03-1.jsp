<%--
  Created by IntelliJ IDEA.
  File: ex07-03-1.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 10:48
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
    String course_id = request.getParameter("course_id");
    String url = "jdbc:oracle:thin:@oracle12.cwdeh862c8nr.ap-northeast-2.rds.amazonaws.com:15211:ORCL";

    String sql = "SELECT * FROM Course WHERE Course_ID = ?";

    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection(url, "y1905096", "pass1905096");
    PreparedStatement pstmt = con.prepareStatement(sql);
    pstmt.setString(1, course_id);

    ResultSet rs = pstmt.executeQuery();
    if (rs.next()) {
        String title = rs.getString(2);
        int c_number = Integer.parseInt(rs.getString(3));
        String professor_id = rs.getString(4);
        int course_fees = Integer.parseInt(rs.getString(5));

        rs.close();
        pstmt.close();
        con.close();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>수정 폼[2]</title>
</head>
<body>
<center>
    <h4>학과명 수정 화면</h4>
    <form action="app07-03-2.jsp" method="post" name="courseform">
        <table border="1" cellpadding="1">
            <tr>
                <td>과목코드</td>
                <td><%=course_id%> <input type="hidden" name="course_id" value="<%=course_id%>"></td>
            </tr>
            <tr>
                <td>과목명</td>
                <td><input type="text" name="title" value="<%=title%>"></td>
            </tr>
            <tr>
                <td>학점수</td>
                <td><input type="text" name="c_number" value="<%=c_number%>"></td>
            </tr>
            <tr>
                <td>담당교수번호</td>
                <td><input type="text" name="professor_id" value="<%=professor_id%>"></td>
            </tr>
            <tr>
                <td>추가수강료</td>
                <td><input type="text" name="course_fees" value="<%=course_fees%>"></td>
            </tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" name="confirm" value="수 정">
                    <input type="button" value="되돌아가기" onclick="javascript:history.back()">
                    <%--                    <input type="reset" name="reset" value="취 소">--%>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
<%
    } else {
        out.println("<h3>학과코드가 존재하지 않습니다.</h3>");
    }
%>
