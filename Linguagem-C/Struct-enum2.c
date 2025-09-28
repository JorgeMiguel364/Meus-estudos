#include <stdio.h>
#include <stdlib.h>

enum dias_semana{domingo, segunda, terca, quarta, quinta, sexta, sabado};

int main()
{
    enum dias_semana d1, d2, d3, d4;
    d1 = domingo;
    d2 = segunda;
    d3 = terca;
    d4 = quarta;

    printf("Domingo corresponde ao numero: %d\n", d1);
    printf("A soma de segunda com terca e: %d\n", d2 + d3);
    printf("Quarta dividido por terca e: %d\n\n", d4 / d3);

    system("pause");
}
