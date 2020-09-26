#include <stdio.h>

int main(void)
{
    // ���ο� �ڷ���: ���� ����� ������ �ڷ���, User Defined Data Type(����� ���� �ڷ���)
    // �̸�: complex
    // ����: 2���� ����(float real ����, float imaginary ����)

    typedef struct myName {
        float real;
        float imaginary;
    } complex;

    complex c1, c2; // complex Ÿ���� ���� c1, c2�� ����

    c1.real = 7.5;
    c1.imaginary = 2.0;

    c1.imaginary = c1.real;

    printf("%.2f", c1.real);
    printf("%.2f", c1.imaginary);

    return 0;
}