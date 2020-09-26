#include <stdio.h>
// 3가지 정보(이름, 나이, 평점)을 하나의 덩어리(그룹)로 묶는 새로운 타입 만들기
typedef struct STUDENT {
    char name[10];
    int age;
    double gpa;
} student;

int main(void)
{
    // student student_one = { "jin", 25, 4.5 };
    // student student_two = { "jin", 25, 4.5 };

    student student[2];
    int i;

    for (i = 0; i < 2; ++i) {
        printf("이름: ");
        scanf("%s", student[i].name);
        printf("나이: ");
        scanf("%d", &student[i].age);
        printf("평점: ");
        scanf("%lf", &student[i].gpa);
    }

    return 0;
}