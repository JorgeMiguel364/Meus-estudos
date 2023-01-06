#include <stdio.h>

// Escrever um programa que mostra ao usuário um menu de opções de 6 carros, e após a escola o programa mostra o preço

int main(void)
{
    int opc;

    printf("Escolha um carro:\n\n");
    printf("1. Carro-A\n");
    printf("2. Carro-B\n");
    printf("3. Carro-C\n");
    printf("4. Carro-D\n");
    printf("5. Carro-E\n");
    printf("6. Carro-F\n");
    printf("> ");
    scanf("%i", &opc);

    switch(opc)
    {
        case 1:
            printf("Carro-A custa 150 mil");
            break;
        case 2:
            printf("Carro-B custa 200 mil");
            break;
        case 3:
            printf("Carro-A custa 300 mil");
            break;
        case 4:
            printf("Carro-A custa 270 mil");
            break;
        case 5:
            printf("Carro-A custa 670 mil");
            break;
        case 6:
            printf("Carro-A custa 760 mil");
            break;
        default:
            printf("Escolha invalida!");
            break;
    }

    printf("\n");
}
