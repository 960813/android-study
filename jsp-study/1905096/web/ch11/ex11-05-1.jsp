<%--
  User: 1905096(진태양)
  Date: 2020-11-18
  Time: 오후 3:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
         import="java.sql.*, javax.sql.*, javax.naming.*" %>
<% request.setCharacterEncoding("UTF-8");%>;
<%
    int i = 0;
    String sql = "SELECT * FROM Course WHERE Professor_ID=?";
    String professor_id = request.getParameter("professor_id");
    try {
        Context init = new InitialContext();
        DataSource ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
        Connection con = ds.getConnection();

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, professor_id);
        ResultSet rs = preparedStatement.executeQuery();
%>
<html>
<head>
    <title>교수의 개설과목</title>
</head>
<body>
<center>
    <table border="1" cellspacing="1">
        <tr>
            <th colspan="5">교수의 개설과목</th>
        </tr>
        <tr>
            <th>순번</th>
            <th>과목코드</th>
            <th>과목명</th>
            <th>학점수</th>
            <th>추가수강료</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%=++i%>
            </td>
            <td><%=rs.getString(1)%>
            </td>
            <td><%=rs.getString(2)%>
            </td>
            <td><%=rs.getInt(3)%>
            </td>
            <td><%=rs.getInt(5)%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <p>Course 테이블에서 검색되었습니다.</p>
    <%
        } catch (Exception e) {
            out.println("<h4>데이터 가져오기에 실패하였습니다.</h4>");
            e.printStackTrace();
        }
    %>
</center>
</body>
</html>
