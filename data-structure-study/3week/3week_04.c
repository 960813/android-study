#include <stdio.h>

int main(void)
{
    // 기성품 이용: C언어의 기본 저장공간 종류(기본 자료형) 이용

    // 1. 변수 선언
    int aa; // 최대 용량 4바이트이고, 정수를 저장할 수 있는 메모리 공간 확보. 이름은 aa로 정함
    int bb;
    int zz[100] = {0}; // 전체 400바이트

    // 2. 만들어진(선언된) 저장공간(변수)을 활용(저장/인출)
    aa = 768896; // 저장
    bb = 3463;
    zz[0] = 11;
    zz[1] = 22;
    zz[2] = 33;

    printf("%d %d\n", aa, bb); // 인출

    printf("sizeof 'zz' = %d\n", sizeof(zz));

    return 0;
}