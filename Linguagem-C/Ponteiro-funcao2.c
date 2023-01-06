#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
    Programa que pede para o usu�rio informar um valor, e o valor ser� somado a um n�mero aleat�rio
    C�digo escrito por meio de modulariza��o e ponteiros
*/

void main()
{
    srand(time(NULL));

    void calcularSoma(int *val1p_soma);

    int valor1, *val1p;

    val1p = &valor1;

    for(;;)
    {
        printf("Informe um valor, e ele sera adicionado a um valor aleatorio: ");
        scanf("%d", &valor1);

        calcularSoma(val1p);
    }
}

void calcularSoma(int *val1p_soma)
{
    int val_aleat = rand() % 100;

    *val1p_soma += val_aleat;

    printf("\nValor aleatorio: %d\n", val_aleat);
    printf("Resultado: %d\n\n", *val1p_soma);

    system("pause");
    printf("\n");
}
