#include <stdio.h>

int rec(int n, int* res)
{
    int result = 0;
    static int count = 0;

    if (n < 2)
        return result;
    if (n % 3 == 0) {
        result = rec(n - 1, res) + n;
        count++;
    } else
        result = rec(n - 1, res);

    printf("count: %d\n", count);
    *res = result + count;
    return result;
}

int main(void)
{
    int result = 0, sum;

    sum = rec(5, &result);
    printf("%d, %d\n", sum, result);

    sum = rec(2, &result);
    printf("%d, %d\n", sum, result);
    return 0;
}