# 자료구조실습 10주차(2020-11-05, 목)

## prefix / infix / postfix

### 변환 과정

* 연산자: push
* 여는 괄호: push
* 닫는 괄호: 짝이 맞는 괄호가 나올때까지 (pop -> 출력) -> ...  pop

* 그 외: pop



## 스택의 응용: 미로 문제

### 개요

* 상-하-좌-우 순서로 이동
* 이미 지나온 길은 다시 가지 않음
* 살펴보지 않은 공간을 Stack에 저장



## 스택의 핵심: LIFO

* Stack Pointer를 어떻게 조정하느냐가 핵심이다
* 저장(push)
  * SP 1 증가
  * 스택에 여유 공간이 있는지 검사
  * 여유가 공간이 있다면 SP가 가리키는 곳에 저장
* 인출(pop)
  * 스택에 데이터가 있는지 검사
  * 인출할 데이터가 있다면, SP가 가리키는 곳에 있는 데이터를 인출
  * SP 1 감소



## 큐, Queue

### 개요

* 선입 선출(FIFO; First In First Out)
* 버퍼(Buffer)라고 부르기도 함

* 삽입(Enqueue), 인출(Dequeue)
* 큐의 앞(Front)과 뒤(Rear)를 가리키는 두개의 Pointer가 요구됨

### 선형 큐(Linear Queue)

#### 삽입(Enqueue)

* Rear Pointer 1 증가

* Rear Pointer 위치에 데이터 삽입

#### 인출(Dequeue)

* Front Pointer 1 증가
* Front Pointer 위치의 데이터를 인출



## 마무리

* 미로 문제는 직접 해보자 Page.135 (과제는 아님) / 시험문제