#include <stdio.h>

int main(void)
{
    char a;

    do
    {
        printf("Digite a letra a: ");
        scanf(" %c", &a);

    }while(a != 'a');

    printf("\nTecla a pressionada.\n");
}
