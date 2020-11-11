<%--
  Created by IntelliJ IDEA.
  File: ex07-01.jsp
  User: 1905096(진태양)
  Date: 2020-10-09
  Time: 오후 9:38
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.sql.*" %>
<%
    int i = 0;

    String sql = "SELECT * FROM Course";
    String url = "jdbc:oracle:thin:@oracle12.cwdeh862c8nr.ap-northeast-2.rds.amazonaws.com:15211:ORCL";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(url, "y1905096", "pass1905096");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<center>
    <h4>[Course 테이블 검색]</h4>
    <table border="1" cellspacing="1">
        <tr>
            <th>순번</th>
            <th>과목코드</th>
            <th>과목명</th>
            <th>학점수</th>
            <th>담당과목번호</th>
            <th>추가수강료</th>
        </tr>
        <%
            while (resultSet.next()) {
        %>
        <tr>
            <td><%=++i%>
            </td>
            <td><%=resultSet.getString(1)%>
            </td>
            <td><%=resultSet.getString(2)%>
            </td>
            <td><%=resultSet.getInt(3)%>
            </td>
            <td><%=resultSet.getString(4)%>
            </td>
            <td><%=resultSet.getInt(5)%>
            </td>
        </tr>
        <%
            }
            resultSet.close();
            statement.close();
            connection.close();
        %>
        <h4>DB에서 정상적으로 검색되었습니다!!</h4>
        <%
        } catch (SQLException e) {
            e.printStackTrace();
        %>
        <h4>에러가 발생했군요. 다시 확인해 보세요!!!</h4>
        <%
            }
        %>
    </table>
</center>

</body>
</html>
