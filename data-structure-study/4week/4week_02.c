#include <stdio.h>

int main(void)
{
    int i;
    // 3가지 정보(이름, 전화번호, 나이)를 포함한 회원 100명의 데이터를 저장/인출

    typedef struct myDataType {
        char name[4]; // 이름
        char phoneNumber[12]; // 전화번호
        int age; // 나이
    } memberInfo;

    memberInfo members[100]; // memberInfo 타입의 데이터 100개를 저장할 수 있는 배열

    for (i = 0; i < 100; ++i) {
        // i번째 회원정보를 저장
        sprintf(members[i].name, "%3d", i);
        sprintf(members[i].phoneNumber, "%s%d", "0101234", i);
        members[i].age = i;
    }

    for (i = 0; i < 100; ++i) {
        printf("%s(%d) > %s\n", members[i].name, members[i].age, members[i].phoneNumber);
    }

    return 0;
}