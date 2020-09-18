#include <stdio.h>

// 다차원 배열(Multi Dimensional Array): 2차원 이상 배열

// 함수 선언
void display_array(int arr[2][3])
{
    int i, j;
    for (i = 0; i < 2; ++i) {
        for (j = 0; j < 3; ++j) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}

int main(void)
{
    int AAA[3][2] = { { 0, 0 }, { 0, 0 }, { 0, 0 } };
    int BBB[2][3] = { { 0, 0, 0 }, { 0, 0, 0 } };

    printf("Berfore \n");
    display_array(BBB);
    
    BBB[0][1] = 77;

    printf("After \n");
    display_array(BBB);

    return 0;
}