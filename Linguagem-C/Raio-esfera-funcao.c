#include <stdio.h>
#include <stdlib.h>

float raio_esfera(float r)
{

    return 4/(3*3.14)*(r*r*r);
}

int main()
{
    float raio_esf;

    printf("Informe o raio da esfera: ");
    scanf("%f", &raio_esf);


    printf("O volume da esfera eh: %f\n\n", raio_esfera(raio_esf));
}
