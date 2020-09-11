#include <stdio.h>

/*
[자료구조실습 2주차 4차시]

1. 정수를 저장할 수 있는 변수를 2개 선언하라. (변수명은 A, B를 사용하라)
2. 변수 A에는 5를, 변수 B에는 2를 저장하라.
3. 두 변수에 저장된 데이터를 인출한 후, 곱셈을 수행하여 그 결과를 변수B에 저장하라.
4. 새로운 변수 C를 선언한 후, C에는 변수 B의 메모리 주소를 저장하라.
5. 변수 C에 저장된 내용을 인출한 후, 화면에 출력하라.(printf 함수 사용)
6. 변수 C에 저장된 내용이 가리키는 곳에 저장된 내용을 화면에 출력하라.(printf 함수 사용)
*/
int main(void)
{
    int A, B;

    A = 5;
    B = 2;

    B = A * B;

    int* C = &B;

    printf("%d\n", C);
    printf("%d\n", *C);

    return 0;
}