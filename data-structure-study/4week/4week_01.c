#include <stdio.h>

int main(void)
{
    // 새로운 자료형: 내가 만드는 나만의 자료형, User Defined Data Type(사용자 정의 자료형)
    // 이름: complex
    // 내용: 2가지 포함(float real 변수, float imaginary 변수)

    typedef struct myName {
        float real;
        float imaginary;
    } complex;

    complex c1, c2; // complex 타입의 변수 c1, c2를 선언

    c1.real = 7.5;
    c1.imaginary = 2.0;

    c1.imaginary = c1.real;

    printf("%.2f", c1.real);
    printf("%.2f", c1.imaginary);

    return 0;
}