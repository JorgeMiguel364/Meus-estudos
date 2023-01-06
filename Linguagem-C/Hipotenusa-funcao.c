#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float hipotenusa(float b, float a)
{
    float hipotenusa = (pow(b, 2)) + (pow(a, 2));

    return pow(hipotenusa, 2);
}

void main()
{
    float base, altura;

    printf("Informe o valor da base: ");
    scanf("%f", &base);

    printf("Informe o valor da altura: ");
    scanf("%f", &altura);

    printf("\nO valor da hipotenusa e: %.2f\n\n", hipotenusa(base, altura));

    system("pause");
}
