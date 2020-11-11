<%--
  Created by IntelliJ IDEA.
  File: ex07-02-1.jsp
  User: 1905096(진태양)
  Date: 2020-10-15
  Time: 오후 8:18
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.sql.*" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<%
    String Course_ID = request.getParameter("course_id");
    String Title = request.getParameter("title");
    int C_Number = Integer.parseInt(request.getParameter("c_number"));
    String Professor_ID = request.getParameter("professor_id");
    int Course_Fees = Integer.parseInt(request.getParameter("course_fees"));
    String url = "jdbc:oracle:thin:@oracle12.cwdeh862c8nr.ap-northeast-2.rds.amazonaws.com:15211:ORCL";
    String sql = "INSERT INTO Course (Course_ID, Title, C_Number, Professor_ID, Course_Fees) VALUES (?, ?, ?, ?, ?)";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(url, "y1905096", "pass1905096");
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, Course_ID);
        pstmt.setString(2, Title);
        pstmt.setInt(3, C_Number);
        pstmt.setString(4, Professor_ID);
        pstmt.setInt(5, Course_Fees);
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();
        out.println("<h4>Course 테이블에 한 행이 저장되었습니다!!!</h4>");
    } catch (SQLException e) {
        out.println("<h4>에러가 발생 했군요. 다시 확인해 보세요!!!</h4>");
    }
%>