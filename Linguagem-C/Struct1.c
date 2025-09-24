#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct pessoa
{
    char nome[50], profissao[50];
    int idade;
};

int main()
{
    struct pessoa p1;

    strcpy(p1.nome, "Joao Helio");
    strcpy(p1.profissao, "Acougueiro");
    p1.idade = 37;

    printf("O nome da pessoa e: %s\n", p1.nome);
    printf("Sua profissao e: %s\n", p1.profissao);
    printf("Sua idade e: %d\n\n", p1.idade);

    system("pause");

    return 0;
}
