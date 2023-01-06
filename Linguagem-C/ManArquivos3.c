#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TAM 40

/*
    Código que compara duas strings e cria um arquivo .txt dizendo se as duas strings são iguais ou não
*/

void main()
{
    void recebeString();

    while(1)
    {
        recebeString();
    }
}

void recebeString()
{
    void comparaStrings(char str3[TAM], char str4[TAM]);

    char str1[TAM], str2[TAM];

    printf("Informe a primeira string: ");
    gets(str1);

    printf("\nInforme a segunda string: ");
    gets(str2);

    comparaStrings(str1, str2);
}

void comparaStrings(char str3[TAM], char str4[TAM])
{
    FILE *arq;

    if (strcmp(str3, str4) == 0)
    {
        arq = fopen("ManArquivos3.txt", "w");
        fprintf(arq, "As duas strings %s e %s sao iguais.", str3, str4);
        fclose(arq);
    }
    else
    {
        arq = fopen("ManArquivos3.txt", "w");
        fprintf(arq, "As duas strings %s e %s nao sao iguais.", str3, str4);
        fclose(arq);
    }

    printf("\nArquivo gerado com sucesso!\n");

    system("pause");

    printf("\n");
}















