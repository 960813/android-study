<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 2020-09-17
  Time: 오후 7:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%! String str = "JSP Web Programming"; %>
<%! int total = 0; %>
<%! public int sum() {
    int result = 0;
    for (int i = 1; i <= 10; ++i) {
        result = result + i;
    }
    return result;
}
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>선언부와 표현식 예제</title>
</head>
<body>
<%= str %> <br>
<%= total %> <br>
<%= "1부터 10까지의 합은 " + sum() + "입니다." %> <p></p>
<%= true %> <br>
<%= new char[]{'a', 'b', 'c'} %> <br>
<%= new java.util.Date() %> <br>
</body>
</html>
