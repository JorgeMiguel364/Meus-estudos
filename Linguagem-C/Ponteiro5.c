#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *vp1, *vp2, val1, val2;

    printf("Informe dois valores: ");
    scanf("%d %d", &val1, &val2);

    vp1 = &val1;
    vp2 = &val2;

    printf("\nOs enderecos dos valores %d e %d sao: 0x%x, 0x%x\n\n", val1, val2, vp1, vp2);
}
