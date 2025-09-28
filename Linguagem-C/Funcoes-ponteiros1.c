#include <stdio.h>
#include <stdlib.h>

void soma(int *n)
{
    *n = *n + 2;
}

int main()
{
    int val;

    printf("Informe um valor: ");
    scanf("%d", &val);

    printf("\nVariavel antes de chamar a funcao: %d", val);

    soma(&val);

    printf("\nVariavel depois de chamar a funcao: %d\n\n", val);

    system("pause");

    return 0;
}
