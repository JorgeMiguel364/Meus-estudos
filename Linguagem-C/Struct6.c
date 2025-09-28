#include <stdio.h>
#include <stdlib.h>

struct endereco
{
    char rua[50];
    int numero;
};

struct pessoa
{
    char nome[50];
    int idade;
    struct endereco end;
};

int main()
{
    struct pessoa p1;

    printf("Informe o nome: ");
    gets(p1.nome);

    printf("Informe a idade: ");
    scanf("%d", &p1.idade);

    setbuf(stdin, 0);

    printf("Informe a rua: ");
    gets(p1.end.rua);

    printf("Informe o numero: ");
    scanf("%d", &p1.end.numero);

    printf("\n%s, %d anos,\n", p1.nome, p1.idade);
    printf("Rua %s, numero %d,\n", p1.end.rua, p1.end.numero);

    printf("\n\n");

    system("pause");

    return 0;
}
