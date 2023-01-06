#include <stdio.h>
#include <stdlib.h>

#define TAMFRASE 50

int main()
{
    char frase1[TAMFRASE]; // Declaração variável char de tamanho TAMFRASE
    int qtLTR=0;

    lerFrase(frase1) // Mesmo que lerFrase(&frase1[0]);

    qtLTR = atdLetras(frase1);
}

int qtdLetras()
{

}

int lerFrase(char *p)
{
    printf("Informe uma frase: ");
    gets(p);

}
