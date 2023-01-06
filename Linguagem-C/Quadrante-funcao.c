#include <stdio.h>
#include <stdlib.h>

int VerificaQuadrante(int coordX, int coordY)
{

    if(coordX > 0 && coordY > 0)    // quadrante 1
        printf("Quadrante 1!");
    else if (coordX < 0 && coordY > 0)  // quadrante 2
        printf("Quadrante 2!");
    else if (coordX < 0 && coordY < 0)  // quadrante 3
        printf("Quadrante 3!");
    else if (coordX > 0 && coordY < 0)  // quadrante 4
        printf("Quadrante 4!");
    else
        printf("Ponto neutro!");

    printf("\n\n");

    system("pause");

    printf("\n");

    main();
}

int main()
{
    int x, y;

    printf("Informe as coordenadas (x, y): ");
    scanf("%i %i", &x, &y);

    VerificaQuadrante(x, y);
}
