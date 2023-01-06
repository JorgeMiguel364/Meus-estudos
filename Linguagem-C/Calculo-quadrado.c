#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int val;

    printf("Informe um valor: ");
    scanf("%d", &val);

    if(val > 0)
    {
        while(val > 0)
        {
            printf("%.0f, ", pow(val--, 2));
        }

    }
    else if (val < 0)
    {
        while(val < 0)
        {
            printf("%.0f, ", pow(val++, 2));
        }
    }

    printf("\n");
    system("pause");

    return 0;
}
