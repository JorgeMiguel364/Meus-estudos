#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char frase[30];

    printf("Informe uma frase: ");
    fgets(frase, 30, stdin);

    printf("\n%s", frase);
    printf("%s\n", strrev(frase));
}
