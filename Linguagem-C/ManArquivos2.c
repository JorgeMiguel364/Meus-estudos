#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

void criaTxt(char carac2)
{
    FILE *arq;

    arq = fopen("ManArquivos2.txt", "w");
    fprintf(arq, "O caractere %c esta armazenado no endereco: 0x%x\n\n", carac2, &carac2);
    fclose(arq);

    printf("\nArquivo criado com sucesso!\n\n");

    system("pause");
    printf("\n");
}

void recebeValor()
{
    char carac;

    printf("Informe um caracter: ");
    carac = getche();
    fflush(stdin);

    criaTxt(carac);
}

void main()
{
    for(;;)
    {
        recebeValor();
    }
}
