#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct valores
{
    int v1, v2, v3, v4, v5;
};

int main()
{
    srand(time(NULL));

    int primeira_vez = 1, indice = 2;

    struct valores numeros[indice];

    for(int i=0; i<indice; i++)
    {
        numeros[i].v1 = rand() % 100;
        numeros[i].v2 = rand() % 100;
        numeros[i].v3 = rand() % 100;
        numeros[i].v4 = rand() % 100;
        numeros[i].v5 = rand() % 100;
    }

    printf("Struct com 5 valores inteiros em um vetor de %d posicoes.\n\n", indice);

    for(int i=0; i<indice; i++)
    {
        if (primeira_vez == 1)
        {
            printf("Array %d:\n", i);
            primeira_vez = 0;
        }

        printf("%d, ", numeros[i].v1);
        printf("%d, ", numeros[i].v2);
        printf("%d, ", numeros[i].v3);
        printf("%d, ", numeros[i].v4);
        printf("%d, ", numeros[i].v5);

        primeira_vez = 1;

        printf("\n\n");
    }

    system("pause");

    return 0;
}
