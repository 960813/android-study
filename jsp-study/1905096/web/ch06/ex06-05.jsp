<%--
  Created by IntelliJ IDEA.
  File: ex06-05.jsp
  User: 1905096(진태양)
  Date: 2020-10-02
  Time: 오후 6:58
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>입력 폼[3]</title>
</head>
<body>
<center>
    <h4>보고싶은 영화제목 선택하기</h4>
    1. 보고 싶은 영화를 선택해 주세요. <br>
    (여러 제목을 선택할 경우에는 Ctrl 키를 사용하세요.) <p></p>
    <form action="ex06-06.jsp" method="post">
        <select name="movie" size="4" multiple>
            <option value="설국열차" selected>설국열차</option>
            <option value="레드:더 레전드">레드:더 레전드</option>
            <option value="친구">친구</option>
            <option value="감시자들">감시자들</option>
            <option value="피아니스트">피아니스트</option>
            <option value="대부">대부</option>
            <option value="담보">담보</option>
            <option value="국제수사">국제수사</option>
            <option value="그린랜드">그린랜드</option>
        </select>
        <p></p>
        <input type="submit" value="전송">
        <input type="reset" value="취소">
    </form>
</center>

</body>
</html>
