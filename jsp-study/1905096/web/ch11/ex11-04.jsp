<%--
  User: 1905096(진태양)
  Date: 2020-11-18
  Time: 오후 3:12
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"
         import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%
    int i = 0;
    String sql = "SELECT * FROM Course WHERE course_fees > 0";
    try {
        Context init = new InitialContext();
        DataSource ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
        Connection con = ds.getConnection();

        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);
%>
<html>
<head>
    <title>Course 테이블 검색</title>
</head>
<body>
<center>
    <table border="1" cellspacing="1">
        <tr>
            <th colspan="6">Course 테이블</th>
        </tr>
        <tr>
            <th>순번</th>
            <th>과목코드</th>
            <th>과목명</th>
            <th>학점수</th>
            <th>교수번호</th>
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
            <td><%=rs.getString(4)%>
            </td>
            <td><%=rs.getInt(5)%>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                out.println("<h4>데이터 가져오기에 실패하였습니다.</h4>");
                e.printStackTrace();
            }
        %>
    </table>
</center>
</body>
</html>
