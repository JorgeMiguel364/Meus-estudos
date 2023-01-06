#include <stdio.h>
#include <stdlib.h>

int dias(int ano, int mes, int dia)
{
    return (ano * 365) + (mes * 31) + dia;
}

int main()
{
    int ano, mes, dia;

    printf("Informe os anos: ");
    scanf("%i", &ano);

    printf("\nInforme os meses: ");
    scanf("%i", &mes);

    printf("\nInforme os dias: ");
    scanf("%i", &dia);

    printf("\nSao %i dias", dias(ano, mes, dia));
    printf("\n");
}
