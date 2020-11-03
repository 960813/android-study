## Intent

* 명시적 Intent: 같은 프로젝트 내에서 Activity의 이름을 알고 있을 때 다른 Activity를 호출하는 목적으로 사용
* 암시적 Intent: Activity의 이름은 모르지만 동작은 알고 있을 때, 즉 다른 App 간의 연동시 사용(Action 정보 부여)
* manifests에서 ACTION에 대한 intent filter를 정의해둠.
* CATEGORY, ACTION을 지정할 수 있는데 CATEGORY는 생략 가능. 지정하면 좋음



## Extra

* 키: 문자열
* 값: 자유
* putExtra -> getIntent() -> getStringExtra . . .



## startActivityForResult

* 매개변수: Intent Object, Request Code
  * 응답: Intent Object, Result Code



## 객체 데이터의 저장/복구

### 개요

* 객체는 몇 바이트로 이루어져있는지 예측할 수 없다.
* 이에 바이트 단위로 객체 자체를 Serialize 해주는 과정이 필요하다.
* 그 후 Deserialize하여 복구한다.

### 방법

* Serializable Interface 구현
  * Class 내부에 Serialize 되지 않는 객체가 있다면 Serialize되지 않음
  * 상속만 받으면 되기 때문에 구현이 편리함
* Parcelable Interface 구현
  * 별도의 메소드 오버라이딩이 요구됨
  * Serialiable Interface에 비해 메모리 관리가 효율적
  * Creator, writeToParcel, describeContents Method 구현 필요



## LifeCycle

* onResume() 단계에서 복구하는 것이 바람직
* onPause() 단계에서 저장하는 것이 바람직



## sharedPreferences

* 간략한 File 형태로 상태를 저장하기 위해 사용
* getSharedPreferences("pref", Acitivty.MODE_PRIVATE); 메소드 호출 시 해당 프로젝트의 sharedPreferences 폴더에 pref라는 이름으로 파일 저장(상태 저장)



## 프래그먼트(Fragment)

* 레이아웃 안에 다른 레이아웃을 배치하여 UI를 구성하는 방식
* 전체 Activity를 분할하여 관리/적용(소규모 Activity라고 볼 수 있음)
* layout.xml 파일에서 fragment 태그에서 차지할 영역을 지정할 수 있다.
  * andorid:name 속성으로 어떤 Class(다른 Widget을 상속 받은)를 사용할 것인지 지정
* LifeCycle(액티비티에 프로그래먼트 추가)
  * onAttach
  * onCreate
    Fragment만 생성
  * onCreateView
    Fragment의 View, Widget 생성 / 프래그먼트에 대한 이벤트 처리 가능
  * onActivityCreated
    Activity의 Create가 완료된 상태 / Activity Level의 Widget에 대한 작업 시 해당 LifeCycle에서 처리 해야 함.
  * onStart
  * onResume
* LifeCycle(액티비티에서 프래그먼트 제거)
  * onPause
  * onStop
  * onDestoryView
  * onDestory
  * onDetach