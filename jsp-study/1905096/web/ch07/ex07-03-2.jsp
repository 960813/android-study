<%--
  Created by IntelliJ IDEA.
  File: ex07-03-2.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 11:00
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
    String Dept_ID = request.getParameter("dept_id");
    String Dept_Name = request.getParameter("dept_name");
    String Dept_Tel = request.getParameter("dept_tel");

    String url = "jdbc:oracle:thin:@oracle11gr2.crwpeutgjyaj.ap-northeast-2.rds.amazonaws.com:15211:ORCL";
    String sql = "UPDATE Department ";
    sql += "SET Dept_Name = ?, Dept_Tel = ? ";
    sql += "WHERE Dept_ID = ?";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "y1905096", "1q2w3e4r");
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, Dept_Name);
        pstmt.setString(2, Dept_Tel);
        pstmt.setString(3, Dept_ID);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();
        out.println(Dept_Name + ", " + Dept_Tel + " 로 수정되었습니다.");
    } catch (Exception e) {
        out.println(Dept_ID + "의 학과코드 수정이 실패했습니다");
    }
%>