#include <stdio.h>

int main(void)
{
    int i;
    // 3���� ����(�̸�, ��ȭ��ȣ, ����)�� ������ ȸ�� 100���� �����͸� ����/����

    typedef struct myDataType {
        char name[4]; // �̸�
        char phoneNumber[12]; // ��ȭ��ȣ
        int age; // ����
    } memberInfo;

    memberInfo members[100]; // memberInfo Ÿ���� ������ 100���� ������ �� �ִ� �迭

    for (i = 0; i < 100; ++i) {
        // i��° ȸ�������� ����
        sprintf(members[i].name, "%3d", i);
        sprintf(members[i].phoneNumber, "%s%d", "0101234", i);
        members[i].age = i;
    }

    for (i = 0; i < 100; ++i) {
        printf("%s(%d) > %s\n", members[i].name, members[i].age, members[i].phoneNumber);
    }

    return 0;
}