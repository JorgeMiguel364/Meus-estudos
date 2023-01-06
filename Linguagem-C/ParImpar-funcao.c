#include <stdio.h>
#include <stdlib.h>

int parImpar(int valPI)
{
    return valPI % 2;
}

int main()
{
    int val;

    for(;;)
    {
        printf("Informe um valor: ");
        scanf("%i", &val);

        if(parImpar(val) == 0)
            printf("\nO valor informado eh par.");
        else
            printf("\nO valor informado eh impar.");

        printf("\n\n");
        system("pause");
        printf("\n");
    }
}
