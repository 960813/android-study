<%--
  Created by IntelliJ IDEA.
  File: ex07-04-1.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 11:19
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
    String dept_id = request.getParameter("dept_id");
    String url = "jdbc:oracle:thin:@oracle11gr2.crwpeutgjyaj.ap-northeast-2.rds.amazonaws.com:15211:ORCL";

    String sql = "DELETE FROM Department WHERE Dept_ID = ?";

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "y1905096", "1q2w3e4r");
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, dept_id);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();
        out.println(dept_id + "의 학과코드가 삭제되었습니다.");
    } catch (Exception e) {
        out.println(dept_id + "의 학과코드는 삭제되지 않았습니다.");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>

</body>
</html>
