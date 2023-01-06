#include <stdio.h>

int main(void)
{
    float dist_perc, combust_gast, gast_medio;

    printf("Informe a distancia percorrida: \n");
    scanf("%f", &dist_perc);

    printf("Informe o total de combustivel gasto: \n");
    scanf("%f", &combust_gast);

    gast_medio = dist_perc / combust_gast;

    printf("O consumo medio do automovel e: %.2f", gast_medio);
}
