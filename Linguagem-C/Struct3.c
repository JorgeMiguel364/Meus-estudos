#include <stdio.h>
#include <stdlib.h>

struct informacoes_pessoa
{
    char nome[50], profissao[50], endereco[50];
    int idade;
};

int main()
{
    struct informacoes_pessoa p1 = {"Luiz Carlos", "motorista", "Rua das acacias 301", 45};

    printf("O nome da pessoa e: %s", p1.nome);
    printf("\nSua profissao e: %s", p1.profissao);
    printf("\nSeu endereco e: %s", p1.endereco);
    printf("\nSua idade e: %d", p1.idade);

    printf("\n\n");
    system("pause");

    return 0;
}
