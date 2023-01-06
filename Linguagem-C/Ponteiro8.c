#include <stdio.h>
#include <time.h>

#define MAXRAND 100

int main()
{
    srand(time(NULL));

    int valor1 = rand() % MAXRAND;
    int *pt1;

    printf("Valor: %d\n", valor1);

    pt1 = &valor1;

    printf("0x%x\n\n", pt1);
}
