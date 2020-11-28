## SELECT 예제

```java
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"
         import="java.sql.*" %>
<%
    int i = 0;

    String sql = "SELECT * FROM Department";
    String url = "jdbc:oracle:thin:@domain.com:port:SID";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(url, "user_id", "user_pw");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            <%=resultSet.getString(1)%>
            <%=resultSet.getString(2)%>
        }
		resultSet.close();
		statement.close();
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>
```

## UPDATE 예제

```java
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
    String Dept_ID = request.getParameter("dept_id");
    String Dept_Name = request.getParameter("dept_name");
    String Dept_Tel = request.getParameter("dept_tel");

    String url = "jdbc:oracle:thin:@domain.com:port:SID";
    String sql = "UPDATE Department ";
    sql += "SET Dept_Name = ?, Dept_Tel = ? ";
    sql += "WHERE Dept_ID = ?";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "user_id", "user_pw");
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, Dept_Name);
        pstmt.setString(2, Dept_Tel);
        pstmt.setString(3, Dept_ID);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();
        out.println(Dept_Name + ", " + Dept_Tel + " 로 수정되었습니다.");
    } catch (Exception e) {
        out.println(Dept_ID + "의 학과코드 수정이 실패했습니다");
    }
%>
```

## DELETE 예제

```java
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" import="java.sql.*" %>
<% request.setCharacterEncoding("UTF-8");%>
<%
    String dept_id = request.getParameter("dept_id");
    String url = "jdbc:oracle:thin:@domain.com:port:SID";

    String sql = "DELETE FROM Department WHERE Dept_ID = ?";

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, "user_id", "user_pw");
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, dept_id);
        pstmt.executeUpdate();

        pstmt.close();
        con.close();
        out.println(dept_id + "의 학과코드가 삭제되었습니다.");
    } catch (Exception e) {
        out.println(dept_id + "의 학과코드는 삭제되지 않았습니다.");
    }
%>
```

## JSP 표준액션 태그

* 클라이언트 또는 웹서버에게 어떠한 동작을 지시하는 태그
* 자바빈즈 지원 태그: 3종류
* 부가적인 기능 지원 태그: 4종류
  ![image-20201128152916414](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128152916414.png)

## 자바빈

### 개념

* 재사용이 가능한 객체지향 프로그래밍 인터페이스
* 데이털르 다루기 위해서 자바로 작성되는 소프트웨어 컴포넌트
* JSP에서 사용하는 자바빈의 컴포넌트 클래스
* 구조 단순, 작성 용이

### JSP 페이지에서 자바빈

* 입력 폼의 데이터와 데이터베이스의 데이터 처리 부분에 활용
* 재사용이 가능한 객체
* MVC 설계 패턴에서 모델로 사용

### 자바빈의 규약

* 클래스는 반드시 파라미터가 없는 기본 생성자를 가진다.
* 클래스는 직렬화되어야 한다.
* 프로퍼티는 get, set 메소드를 통해 읽고 저장할 수 있어야 한다.
* 프로퍼티마다 getter, setter가 있어야 한다.
* getter는 파라미터가 없어야 한다.
* setter는 하나 이상의 파라미터를 가진다.
* 프로퍼티 접근제어자는 private
* getter/setter와 클래스는 public으로 선언해야 한다.

### LoginBean 예제

```java
package ch08;

public class LoginBean {
    private String id = "";
    private String pw = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
```

### 웹프로젝트 개발의 자바빈 활용

![image-20201128154440551](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128154440551.png)

### 자바빈의 스코프(scope) 속성

![image-20201128155020468](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128155020468.png)

| 영역        | 설명                                                   |
| ----------- | ------------------------------------------------------ |
| page        | 요청에 의해 생성된 페이지에서만 객체가 사용            |
| request     | 클라이언트의 요청이 수행하는 페이지에서 객체가 사용    |
| session     | 객체가 생성된 세션에서 요청을 처리하는 페이지에서 사용 |
| application | 객체가 생성된 응용 프로그램에 포함된 페이지에서 사용   |

### 자바빈 표준 액션 태그

* `<jsp:useBean>` 태그
  ![image-20201128155648303](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128155648303.png)
  * JSP 페이지에서 주어진 영역에 특정 자바빈을 사용하기 위해 컨테이너에게 알려주는 태그
  * 자바빈 이름 지정
* `<jsp:setProperty>` 태그
  ![image-20201128155657650](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128155657650.png)
  * JSP 페이지에서 `<jsp:useBean>` 태그로 지정한 자바빈에 주어진 영역에서 자바빈의 프로퍼티 값 설정
* `<jsp:getProperty>` 태그
  ![image-20201128155705635](C:\repository\ync-2nd-grade-at-2020-02\기말고사\04_JSP프로그래밍\img\image-20201128155705635.png)
  * JSP 페이지에서 `<jsp:useBean>` 태그로 지정한 자바빈으로부터 주어진 영역에서 자바빈의 프로퍼티 값을 반환

### 부가적인 액션 태그

