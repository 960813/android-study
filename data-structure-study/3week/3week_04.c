#include <stdio.h>

int main(void)
{
    // �⼺ǰ �̿�: C����� �⺻ ������� ����(�⺻ �ڷ���) �̿�

    // 1. ���� ����
    int aa; // �ִ� �뷮 4����Ʈ�̰�, ������ ������ �� �ִ� �޸� ���� Ȯ��. �̸��� aa�� ����
    int bb;
    int zz[100] = {0}; // ��ü 400����Ʈ

    // 2. �������(�����) �������(����)�� Ȱ��(����/����)
    aa = 768896; // ����
    bb = 3463;
    zz[0] = 11;
    zz[1] = 22;
    zz[2] = 33;

    printf("%d %d\n", aa, bb); // ����

    printf("sizeof 'zz' = %d\n", sizeof(zz));

    return 0;
}