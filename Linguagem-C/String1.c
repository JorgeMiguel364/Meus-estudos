#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int x = 0;
    char string[50];

    printf("Informe uma string: ");
    fflush(stdin);
    fgets(string, 50, stdin);

    for (int i=0; i<50; i++)
    {
        if (strchr(string, "Aa"))
        {
            x++;
        }
    }

    if (x == 0)
        printf("\nA string nao contem a letra a\n");
    else
        printf("\nA string contem %d letras a\n", x);
}
