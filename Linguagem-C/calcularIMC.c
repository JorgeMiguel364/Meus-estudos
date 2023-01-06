#include <stdio.h>

/*
Escrever um programa que recebeo peso e a altura de uma pessoa, calcular o IMC, e diz se está bom ou não
Usar encadeamento de decisão

IMC = peso / (altura * altura)

*/

int main(void)
{
    float altura, peso, IMC;

    printf("***** Calculo de IMC *****\n\n");
    printf("Informe a altura:\n");
    scanf("%f", &altura);

    printf("Informe o peso:\n");
    scanf("%f", &peso);

    IMC = peso / (altura * altura);

    printf("\nIMC: %.2f\n", IMC);

    if(IMC < 18.5)
        printf("- Abaixo do peso\n");
    else if (IMC > 24.9)
        printf("- Acima do peso\n");
    else
        printf("- Peso adequado\n");
}
