#include <stdio.h>
#include <stdlib.h>

// Cópia de uma struct para outra

struct cidade
{
    char nome[50], estado[50];
    int habitantes;
};

int main()
{
    struct cidade c1 = {"Louis", "AM", 250000};
    struct cidade c2 = c1;

    printf("A primeira cidade e:");
    printf("\n%s, %s, %d habitantes", c1.nome, c1.estado, c1.habitantes);

    printf("\n\nA segunda cidade e:");
    printf("\n%s, %s, %d habitantes", c1.nome, c1.estado, c1.habitantes);

    printf("\n\n");
    system("pause");
}
