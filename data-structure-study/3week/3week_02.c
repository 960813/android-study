#include <stdio.h>

// ������ �迭(Multi Dimensional Array): 2���� �̻� �迭

// �Լ� ����
void display_array(int arr[2][2][3])
{
    int i, j, k;
    for (i = 0; i < 2; ++i) {
        for (j = 0; j < 2; ++j) {
            for (k = 0; k < 3; ++k) {
                printf("%d ", arr[i][j][k]);
            }
        }
        printf("\n");
    }
}

int main(void)
{
    int AAA[2][2][3] = {
        { { 0, 0, 0 }, { 0, 0, 0 } },
        { { 0, 0, 0 }, { 0, 0, 0 } }
    };

    printf("Berfore \n");
    display_array(AAA);

    AAA[0][0][1] = 77;

    printf("After \n");
    display_array(AAA);

    return 0;
}