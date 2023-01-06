#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int calculo(int x, int a, int c)
{
    return pow(x, 2) + 4 * a * c - 36;
}

int main()
{
    int x, a, c;

    printf("Informe o valor de x: ");
    scanf("%i", &x);

    printf("\nInforme o valor de A: ");
    scanf("%i", &a);

    printf("\nInforme o valor de C: ");
    scanf("%i", &c);

    printf("\nO resultado da operacao eh: %i\n\n", calculo(x, a, c));
}
