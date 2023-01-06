#include <stdio.h>

int main()
{
    int i;
    float tempo, tempo_medio;

    printf("Informe 10 valores de tempo, e o programa vai calcular sua media.\n\n");

    for(i=0; i<10; i++)
    {
        printf("%i - Informe o valor de tempo: ", i);
        scanf("%f", &tempo);

        tempo_medio += tempo;
    }

    tempo = tempo_medio / 10;

    printf("\nO tempo medio e: %.2f\n", tempo);
}
