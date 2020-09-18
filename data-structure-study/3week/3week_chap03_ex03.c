#include <stdio.h>

int main(void)
{
    int array1[10];
    double array2[10];
    char array3[40];
    float array4[10];

    printf("%d\n%d\n%d\n%d\n", sizeof(array1), sizeof(array2), sizeof(array3), sizeof(array4));

    return 0;
}