#include <stdio.h>
#include <stdlib.h>

int repeticao()
{
    int valor;

    printf("Informe um valor: ");
    scanf("%d", &valor);

    printf("\n");

    for(int i=valor; i>=0; i--)
    {
        printf("%d, ", i);
    }

    return 0;
}

int main()
{
    repeticao();

    printf("\n\n");
    system("pause");

    return 0;
}
