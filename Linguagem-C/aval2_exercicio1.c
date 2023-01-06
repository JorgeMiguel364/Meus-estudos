#include <stdio.h>

int main(void)
{
    int numero, i;

    for(i=0; i<10; i++)
    {
        printf("%i - Informe um valor: ", i);
        scanf("%i", &numero);

        if (numero == 5)
            exit(1);
    }
}
