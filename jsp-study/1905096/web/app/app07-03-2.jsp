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
    String Course_ID = request.getParameter("course_id");
    String Title = request.getParameter("title");
    int C_Number = Integer.parseInt(request.getParameter("c_number"));
    String Professor_ID = request.getParameter("professor_id");
    int Course_Fees = Integer.parseInt(request.getParameter("course_fees"));

    String url = "jdbc:oracle:thin:@oracle11gr2.crwpeutgjyaj.ap-northeast-2.rds.amazonaws.com:15211:ORCL";
    String sql = "UPDATE Course ";
    sql += "SET Title = ?, C_Number = ?, Professor_ID = ?, Course_Fees = ? ";
    sql += "WHERE Course_ID = ?";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "y1905096", "1q2w3e4r");
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, Title);
        pstmt.setInt(2, C_Number);
        pstmt.setString(3, Professor_ID);
        pstmt.setInt(4, Course_Fees);
        pstmt.setString(5, Course_ID);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();
        out.println(Course_ID + "행이 수정되었습니다.");
    } catch (Exception e) {
        out.println(Course_ID + " 수정이 실패했습니다");
    }
%>