#include <stdio.h>

// 0. ������ �ڷ����� ����: (��) int ���� 1�� + char ���� 2�� + float ���� 1��
typedef struct myDataType {
    int member_int;
    char member_char1;
    char member_char2;
    float member_float;
} myDataType2;

int main(void)
{
    // Ŀ���� �ڷ���(������ �������) �̿�: C����� �⺻ �ڷ����� �����ؼ�, ������ �ڷ����� ����

    // 1. ���� ����
    myDataType2 ZZ; // myDataType �̶�� ��Ư�� �̸��� ����, ������ �ڷ������� �޸𸮰��� Ȯ��

    // printf("sizeof 'ZZ' is %d\n", sizeof(ZZ));

    // 2. �������(�����) �������(����)�� Ȱ��(����/����)
    ZZ.member_int = 768896;
    ZZ.member_char1 = 'K';
    ZZ.member_char2 = 'P';
    ZZ.member_float = 54.2f;

    printf("%d %c %c %f\n", ZZ.member_int, ZZ.member_char1, ZZ.member_char2, ZZ.member_float);

    return 0;
}