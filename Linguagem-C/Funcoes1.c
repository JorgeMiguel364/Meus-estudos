#include <stdio.h>
#include <stdlib.h>

int multiplicacao(int v1, int v2)
{
    return v1 * v2;
}

int main()
{
    int val1, val2;

    printf("Informe o primeiro valor: ");
    scanf("%d", &val1);
    printf("Informe o segundo valor: ");
    scanf("%d", &val2);

    printf("\nA multiplicacao dos dois valores e: %d\n\n", multiplicacao(val1, val2));

    system("pause");
}
