#include <stdio.h>
#include <stdlib.h>

int main()
{
    int val1 = 15;
    int *val1pt = &val1;
    *val1pt = *val1pt + 3;

    int val2 = 20;
    int *val2pt = &val2;
    *val2pt = *val2pt * 2;

    printf("%d - 0x%x - %d\n", val1, &val1, *val1pt);
    printf("%d - 0x%x - %d\n", val2, &val2, *val2pt);

}
