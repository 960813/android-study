# JSP 프로그래밍 13주차

## 들어가며

* 지난 강의에서 JNDI 등록과 DBCP를 이용한 DB 연동 작업 수행
  * `WebContent/META-INF/context.xml` 생성 => type, driverClassName, url, username, userpass
  * 1단계: `javax.sql.*`, `javax.naming.*` import
  * 2단계: Connection 수립
* `EL`에 대해 조금 이야기하다 마침
  * 표기법 : `${}`
  * 종류: 산술, 비교, 논리 연산 수행 가능

## EL 내장객체

* Scope: pageScope, requestScope, sessionScope, applicationScope
* 요청 파라미터: param, paramValues
* 헤더 값: header, headerValues
* 쿠키 값 : Cookies

## JSTL(JSP Standard Tag Library)

### 개요

* `core`,`format`,`database`,`xml`,`functions` 5개의 라이브러리
* `functions`는 함수, 4개 라이브러리들은 커스텀 액션 태그