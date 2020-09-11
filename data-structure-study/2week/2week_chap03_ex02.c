#include <stdio.h>

int main(void)
{
    float a[100];

    for (int i = 0; i < 10; ++i) {
        printf("%d. %d - %d = %d\n", i, &a[i], &a[0], 1000 + sizeof(float) * (&a[i] - &a[0]));
    }

    return 0;
}