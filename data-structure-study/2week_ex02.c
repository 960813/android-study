#include <stdio.h>

/*
1. int 타입의 정수 6개를 저장할 공간 확보
2. 배열 AAA에서 3번째 장소에 Data 77을 저장하라.
3. 배열 AAA에서 2번 인덱스를 가진 공간에서 데이터를 빼낸 후, 화면에 출력하라. (printf 사용)
*/
int main(void)
{
    int AAA[6];

    AAA[2] = 77;

    printf("%d\n", AAA[2]);

    return 0;
}