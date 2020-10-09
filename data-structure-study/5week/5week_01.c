#include <stdio.h>

int main(void)
{
    // 문자를 저장할 수 있는 저장공간(변수) 선언
    char A1;
    A1 = 'k';

    // 주소를 저장할 수 있는 변수(포인터 변수) 선언
    char* B1;

    // 주소를 저장할 수 있는 포인터 변수 B1에 변수 A1의 주소를 저장
    B1 = &A1; // A1 변수의 메모리 주소

    printf("%c\n", A1);

    // 아래 둘은 동일한 동작을 보여준다.
    A1 = 'g';
    *B1 = 'g';
    printf("%c\n", A1);

    return 0;
}