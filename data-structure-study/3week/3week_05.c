#include <stdio.h>

// 0. 나만의 자료형을 설계: (예) int 공간 1개 + char 공간 2개 + float 공간 1개
typedef struct myDataType {
    int member_int;
    char member_char1;
    char member_char2;
    float member_float;
} myDataType2;

int main(void)
{
    // 커스텀 자료형(나만의 저장공간) 이용: C언어의 기본 자료형을 조합해서, 나만의 자료형을 만듦

    // 1. 변수 선언
    myDataType2 ZZ; // myDataType 이라는 독특한 이름을 가진, 나만의 자료형으로 메모리공간 확보


    // 4 + 1 + 1 + 4 = 10, 그러나 가장 큰 자료형을 기준으로 정렬하기 때문에 padding을 2 추가해서 12가 됨.
    printf("sizeof 'ZZ' is %d\n", sizeof(ZZ));

    // 2. 만들어진(선언된) 저장공간(변수)을 활용(저장/인출)
    ZZ.member_int = 768896;
    ZZ.member_char1 = 'K';
    ZZ.member_char2 = 'P';
    ZZ.member_float = 54.2f;

    printf("%d %c %c %f\n", ZZ.member_int, ZZ.member_char1, ZZ.member_char2, ZZ.member_float);

    return 0;
}