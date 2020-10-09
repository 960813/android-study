#include <stdio.h>

int main(void)
{
    int a = 77;
    int** pA = NULL;
    int* pB = NULL;

    pB = &a;
    pA = &pB;

    printf("%d\t%d\t%d", **pA, *pB, a);

    return 0;
}