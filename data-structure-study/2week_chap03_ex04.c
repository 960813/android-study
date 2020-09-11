#include <stdio.h>

int main(void)
{
    int two[10], i;

    for (i = 0; i < sizeof(two) / sizeof(int); ++i) {
        two[i] = 1 << i;
        printf("2^%d = %d\n", i, two[i]);
    }

    return 0;
}