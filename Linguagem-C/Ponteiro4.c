#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x;
    x = 10 + 20;

    int *pt = &x;

    printf("%d\n", *pt);
}
