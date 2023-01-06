#include <stdio.h>

int main()
{
    int valor;

    printf("Informe um valor positivo: ");
    scanf("%d", &valor);

    printf("\n");

    while(valor >= 0)
    {
        printf("%d\n", valor);
        valor--;
    }
}
