#include <stdio.h>
#include <stdlib.h>

typedef int inteiro;

int main()
{
    inteiro valor1, valor2, soma;

    printf("Informe o primeiro valor: ");
    scanf("%d", &valor1);
    printf("Informe o segundo valor: ");
    scanf("%d", &valor2);

    soma = valor1 + valor2;

    printf("\nA soma de %d mais %d e: %d\n\n", valor1, valor2, soma);

    system("pause");

    return 0;
}
