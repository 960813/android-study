#include <stdio.h>

// 다차원 배열(Multi Dimensional Array): 2차원 이상 배열

// 함수 선언
void display_array(char arr[2][2][5])
{
    int i, j, k;
    for (i = 0; i < 2; ++i) {
        for (j = 0; j < 2; ++j) {
            for (k = 0; k < 5; ++k) {
                printf("%c", arr[i][j][k]);
            }
        }
    }
    printf("\n");
}

int main(void)
{
    // south korea daegu.!! => 20글자
    char AAA[2][2][5] = {
        { { 's', 'o', 'u', 't', 'h' }, { ' ', 'k', 'o', 'r', 'e' } },
        { { 'a', ' ', 'd', 'a', 'e' }, { 'g', 'u', '.', '!', '!' } }
    };

    printf("Berfore \n");
    display_array(AAA);

    AAA[0][1][1] = 'K';
    AAA[1][0][2] = 'D';

    printf("After \n");
    display_array(AAA);

    return 0;
}