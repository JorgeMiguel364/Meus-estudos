#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define TAMFRASE 50

void lerFrase(char *p)
{
    printf("Digite uma frase: ");
    gets(p);
}

int contaA(char *p, char letr)
{
    int tam = strlen(p);
    int qtdA = 0;

    for (int i=0; i<tam; i++)
    {
        if (p[i] == toupper(letr) || p[i] == tolower(letr))
        {
            qtdA++;
        }
    }

    return qtdA;
}

int main()
{
    int qtdA;

    char frase[TAMFRASE];

    lerFrase(&frase[0]);

    qtdA = contaA(frase, 'a');

    if(qtdA == 0)
        printf("\nA frase %s nao contem as letras(a/A)\n", frase);
    else
        printf("\nA frase %s tem %d letras(a/A)\n", frase, qtdA);

    return 0;
}
