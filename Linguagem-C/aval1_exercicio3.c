#include <stdio.h>

int main(void)
{
    char nome_aluno[30];
    float nota1, nota2, nota3, media;

    printf("Informe o nome do aluno: \n");
    scanf("%s", &nome_aluno);

    printf("Informe a nota 1: \n");
    scanf("%f", &nota1);

    printf("Informe a nota 2: \n");
    scanf("%f", &nota2);

    printf("Informe a nota 3: \n");
    scanf("%f", &nota3);

    media = (nota1 + nota2 + nota3) / 3;

    printf("\nAluno: %s", nome_aluno);
    printf("\nMedia: %.2f\n", media);

    if (media >= 6)
        printf("Situacao: APROVADO\n");
    else
        printf("Situacao: REPROVADO\n");
}
