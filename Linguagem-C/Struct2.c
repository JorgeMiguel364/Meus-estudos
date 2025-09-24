#include <stdio.h>
#include <stdlib.h>

struct informacoes
{
    int idade;
    float altura, peso;
};

int main()
{
    struct informacoes pessoa1;

    printf("Informe a idade da pessoa: ");
    scanf("%d", &pessoa1.idade);

    printf("Informe a altura da pessoa: ");
    scanf("%f", &pessoa1.altura);

    printf("Informe o peso da pessoa: ");
    scanf("%f", &pessoa1.peso);

    printf("\n");
    system("pause");
    system("cls");

    printf("A idade informada e: %d\n", pessoa1.idade);
    printf("A altura informada e: %.2f\n", pessoa1.altura);
    printf("O peso informado e: %.2f\n", pessoa1.peso);

    printf("\n");
    system("pause");

    return 0;
}
