<%--
  Created by IntelliJ IDEA.
  File: 1905096_hb_view.jsp
  User: 1905096(진태양)
  Date: 2020-10-26
  Time: 오후 11:53
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    String url = "jdbc:oracle:thin:@oracle12.cwdeh862c8nr.ap-northeast-2.rds.amazonaws.com:15211:ORCL";
    int i = 0;
    int total_grade = 0;
    double total_score = 0.0;

    Map<String, Double> score_map = new HashMap<String, Double>();
    score_map.put("A+", 4.5);
    score_map.put("A", 4.0);
    score_map.put("B+", 3.5);
    score_map.put("B", 3.0);
    score_map.put("C+", 2.5);
    score_map.put("C", 2.0);
    score_map.put("D+", 1.5);
    score_map.put("D", 1.0);
    score_map.put("F", 0.0);

    try {
        Connection con = DriverManager.getConnection(url, "y1905096", "pass1905096");
        String sql = "SELECT * FROM ScoreList WHERE Student_ID = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, request.getParameter("Student_ID"));

        ResultSet rs = pstmt.executeQuery();

        String user_sql = "SELECT Dept_Name, Year, Student_ID, Name \n" +
                "FROM STUDENT S INNER JOIN Department D ON (S.Dept_ID = D.Dept_ID) \n" +
                "WHERE Student_ID = ?";
        PreparedStatement user_statement = con.prepareStatement(user_sql);
        user_statement.setString(1, request.getParameter("Student_ID"));

        ResultSet user_result = user_statement.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>개인별 성적표</title>
    <style>
        tr.list:nth-child(2n) {
            background-color: #ffc669;
        }

        tr.list:nth-child(2n + 1) {
            background-color: #c4ffc6;
        }

        body {
            background-color: #c1dbff;
        }

        table {
            background-color: white;
        }

        h3 {
            font-style: italic;
        }

        table#summary {
            margin-top: 1rem;
        }

        table#summary tr > td:nth-child(2) {
            text-align: right;
            padding-left: 1rem;
            padding-right: 0.5rem;
        }
    </style>
</head>
<body>
<center>
    <h3>1905096 - 진태양</h3>
    <h4>개 인 별 성 적 표</h4>
    <table border="1" cellspacing="1">
        <tr>
            <td>학과</td>
            <td>학년</td>
            <td>학번</td>
            <td>성명</td>
        </tr>
        <tr>
            <%
                user_result.next();
            %>
            <td><%= user_result.getString(1)%>
            </td>
            <td><%= user_result.getString(2)%>
            </td>
            <td><%= user_result.getString(3)%>
            </td>
            <td><%= user_result.getString(4)%>
            </td>
        </tr>
    </table>
    <hr>
    <table border="1" cellspacing="1">
        <tr style="background-color: black; color:white;">
            <td>순번</td>
            <td>과목번호</td>
            <td>과목명</td>
            <td>학점</td>
            <td>성적</td>
            <td>등급</td>
        </tr>
        <%
            while (rs.next()) {
                total_grade += rs.getInt(7);
                total_score += score_map.get(rs.getString(9).trim()) * rs.getInt(7);
        %>
        <tr class="list">
            <td><%= ++i%>
            </td>
            <td><%= rs.getString(1)%>
            </td>
            <td><%= rs.getString(6)%>
            </td>
            <td><%= rs.getInt(7)%>
            </td>
            <td><%= rs.getString(8)%>
            </td>
            <td><%= rs.getString(9)%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        rs.close();
        pstmt.close();
        con.close();

        user_result.close();
        user_statement.close();
    %>
    <table border="0" cellspacing="0" id="summary">
        <tr>
            <td>총취득과목수</td>
            <td><%=i%>
            </td>
            <td>과목</td>
        </tr>
        <tr>
            <td>총최득학점수</td>
            <td><%=total_grade%>
            </td>
            <td>학점</td>
        </tr>
        <tr>
            <td>전체평균평점</td>
            <td><%=String.format("%.2f", total_score / total_grade)%>
            </td>
            <td>점</td>
        </tr>
        <tr>
            <td>전체평균등급</td>
            <td>
                <%
                    double avg_score = Double.parseDouble(String.format("%.2f", total_score / total_grade));
                    if (avg_score >= 4.01) {
                        out.println("A+");
                    } else if (avg_score >= 3.51) {
                        out.println("A");
                    } else if (avg_score >= 3.01) {
                        out.println("B+");
                    } else if (avg_score >= 2.51) {
                        out.println("B");
                    } else if (avg_score >= 2.01) {
                        out.println("C+");
                    } else if (avg_score >= 1.51) {
                        out.println("C");
                    } else if (avg_score >= 1.01) {
                        out.println("D+");
                    } else if (avg_score >= 0.01) {
                        out.println("D");
                    } else {
                        out.println("F");
                    }
                %>
            </td>
        </tr>
    </table>
    <h3>성적데이터가 DB에서 출력되었습니다.</h3>
    <% } catch (SQLException e) { %>
    <h3>에러 발생!!! 다시 확인해 보세요!!!</h3>
    <% } %>
</center>
</body>
</html>
