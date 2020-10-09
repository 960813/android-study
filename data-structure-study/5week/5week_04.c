#include <stdio.h>

int main(void)
{
    int A[3] = { 2, 4, 8 };

    // 아래 셋은 같은 결과를 보여준다.
    printf("%d ", A);
    printf("%d ", &A);
    printf("%d\n", &A[0]);

    printf("%d ", *(A + 0));
    printf("%d ", *(A + 1));
    printf("%d\n", *(A + 2));

    printf("%d ", A[0]);
    printf("%d ", A[1]);
    printf("%d\n", A[2]);
    return 0;
}