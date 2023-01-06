#include <stdio.h>

int main(void)
{
    int valor;

    printf("Informe um valor inteiro: \n");
    scanf("%i", &valor);

    if (valor > 100)
    {
        if (valor < 200)
            printf("O valor informado esta entre 100 e 200.");
        else
            printf("O valor informado nao esta entre 100 e 200.");
    }
    else
        printf("O valor informado nao esta entre 100 e 200.");
}
