#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char quantidadeLetras(char frase2[])
{
    return strlen(frase2);
}

int main()
{
    char frase[20];
    int qtst=0;

    printf("Informe uma frase: ");
    fgets(frase, 20, stdin);

    qtst = quantidadeLetras(frase);

    printf("A frase %s contem: %d string(s)\n", frase, qtst);
}
