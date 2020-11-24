# 안드로이드프로그래밍 - 13주차

## ViewPager

* 손가락으로 좌우 스크롤하여 프래그먼트 화면을 전환하는 것
* 어댑터(Adapter) - `Adapter View` `Adapter Item`을 통해 구현 가능

## 어댑터

* `ViewPager`을 구현할 때 `FragmentStatePagerAdapter`를 활용
* `FragmentStatePagerAdapter` 를 상속하고, `getItem`, `getCount` 메소드를 오버라이딩하면 된다.

## 바로가기 메뉴

* 좌측 상단의 햄버거 모양 아이콘을 눌렀을 때 나타나는 화면으로 기본화면 유형(`Navigation Drawer Activity`)에 있음

## 서비스

* 서비스는 화면이 없는 상태에서 백그라운드로 실행됨
* 서비스는 프로세스가 종료되어도 시스템에서 자동으로 재시직함
* 여러 액티비티에서 공통적으로 사용하려는 기능을 사전 정의하고 호출할 수 있도록 지원 - `Service` 객체 
* 프로세스
  1. 시작 시키기 `startService()`
  2. (서비스) `onCreate` / `onBind` 호출
  3. (서비스) `onDestory()` 호출
  4. (시스템) 자동 재시작 => 2번으로 이동

## 