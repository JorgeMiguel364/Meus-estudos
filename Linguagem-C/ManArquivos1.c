#include <stdio.h>
#include <time.h>

/*
    Programa que cria um arquivo .txt
    E a cada execução cria um valor aleatório
*/

int main()
{
    srand(time(NULL));

    FILE *arq;
    int val;

    for(;;)
    {
        val = rand() % 100;

        arq = fopen("ManArquivos1.txt", "w");
        fprintf(arq, "%d - Meu primeiro programa!", val);
        fclose(arq);

        printf("Arquivo criado com sucesso!\n\n");

        system("pause");
        printf("\n");
    }
}
