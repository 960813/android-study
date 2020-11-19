<%--
  User: 1905096(진태양)
  Date: 2020-11-18
  Time: 오후 2:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
         import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%
    try {
        Context init = new InitialContext();
        DataSource ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
        Connection con = ds.getConnection();
        out.println("<h4>데이터베이스 서버에 연결되었습니다.</h4>");
    } catch (Exception e) {
        out.println("<h4>데이터베이스 서버에 연결이 되지 않았습니다.</h4>");
        e.printStackTrace();
    }
%>