# 자바 프로그래밍(2) 11주차 / 2020-11-10

## Tree 계열

* 정리를 잘하는 Tree로 시작하는 클래스
* Comparable Interface를 구현해주어야 작동한다. - `public int compareTo(T o)`
  * ?
* Comparator Interface 구현 - `Compare(T o1, T o2)` 오버라이딩
  * 특정 데이터에 대해 정렬

## Stream

* 단방향 / InputStream, OutputStream
* FIFO 구조이다
* Stream 끼리 연결이 가능하다.(Filter Chain)
* 데이터 종류에 따른 분류
  * 바이트: 동영상, 이미지, 사운드 등과 같은 형태
  * 문자(char: 16bit / 2byte)
* ObjectInputStream / ObjectOutputStream

## I/O 프로그래밍의 절차

* 원하는 대상을 정한다
* 