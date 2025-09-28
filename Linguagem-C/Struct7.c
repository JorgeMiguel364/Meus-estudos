#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct dados_pessoais
{
    int RG, CPF, idade;
};

struct pessoa
{
    char nome[50], cidade_natal[50], cidade_atual[50];
    struct dados_pessoais dados;
};

int main()
{
    struct pessoa p1;

    //p1.nome = "Renan Bastos da Silva";
    //p1.cidade_natal = "Sao Paulo";
    //p1.cidade_atual = "Luiz do Aconchego";

    strcpy(p1.nome, "Renan Bastos da Silva");
    strcpy(p1.cidade_natal, "Sao Paulo");
    strcpy(p1.cidade_atual, "Luiz do Aconchego");

    p1.dados.RG = 794158032;
    p1.dados.CPF = 99526812;
    p1.dados.idade = 29;

    printf("Nome:\n");
    printf("%s", p1.nome);
    printf("\n\nCidade natal:\n");
    printf("%s", p1.cidade_natal);
    printf("\n\nCidade atual:\n");
    printf("%s", p1.cidade_atual);

    printf("\n\nRG:\n");
    printf("%d", p1.dados.RG);
    printf("\n\nCPF:\n");
    printf("%d", p1.dados.CPF);
    printf("\n\nIdade:\n");
    printf("%d", p1.dados.idade);

    printf("\n\n");
    system("pause");

    return 0;
}
