#include <stdio.h>
#include <stdlib.h>

struct informacoes
{
    char nome[50], endereco[50];
    int idade;
};

typedef struct informacoes inf;

int main()
{
    inf pessoa1 = {"Carlos Lima", "Rua Albuquerque, 349", 32};

    printf("Nome:\n");
    printf("%s", pessoa1.nome);

    printf("\n\nEndereco:\n");
    printf("%s", pessoa1.endereco);

    printf("\n\nIdade:\n");
    printf("%d", pessoa1.idade);

    printf("\n\n");
    system("pause");
}
