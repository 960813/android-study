<%--
  Created by IntelliJ IDEA.
  File: ex07-02-1.jsp
  User: 1905096(진태양)
  Date: 2020-10-15
  Time: 오후 8:18
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<%
    String Dept_ID = request.getParameter("dept_id");
    String Dept_Name = request.getParameter("dept_name");
    String Dept_Tel = request.getParameter("dept_tel");
    String sql = "INSERT INTO Department (Dept_ID, Dept_Name, Dept_Tel) VALUES (?, ?, ?)";
    try {
        Context init = new InitialContext();
        DataSource ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
        Connection connection = ds.getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, Dept_ID);
        pstmt.setString(2, Dept_Name);
        pstmt.setString(3, Dept_Tel);
        pstmt.executeUpdate();

        pstmt.close();
        connection.close();
        out.println("<h4>Department 테이블에 한 행이 저장되었습니다!!!</h4>");
    } catch (SQLException e) {
        out.println("<h4>에러가 발생 했군요. 다시 확인해 보세요!!!</h4>");
    }
%>