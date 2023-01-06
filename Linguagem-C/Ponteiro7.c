#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *pont = 0x61fe14;
    int posmem, aux = 0;

    for(;;)
    {
        if(aux == 0)
        {
            printf("---> 0x%x\n", pont);
            printf("Valor armazenado: %d\n\n", *pont);
            aux++;
        }

        printf("Informe quantas posicoes na memoria o ponteiro ira deslocar: ");
        scanf("%d", &posmem);

        pont += posmem;

        printf("\n");
        printf("---> 0x%x\n", pont);
        printf("Valor armazenado: %d", *pont);

        printf("\n");
        system("pause");
        printf("\n-----------------------------------------------------------------------\n\n");
    }
}
