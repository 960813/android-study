<%--
  User: 1905096(진태양)
  Date: 2020-11-18
  Time: 오후 4:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<h4>EL 연산자 예제(2)</h4>
${"(1) 비교 연산자"} <br>
\${10 >= 20} => ${10 >= 20} <br>
\${10 <= 20} => ${10 <= 20} <br>
\${10 == 20} => ${10 == 20} <br>
<br>
${"(2) 논리 연산자"} <br>
\${true && true} => ${true && true} <br>
\${true || false} => ${true || false} <br>
<br>
${"(3) 조건 연산자"} <br>
\${2+5==7 ? 7:10} => ${2+5==7 ? 7:10} <br>