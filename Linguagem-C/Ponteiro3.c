#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int x = rand() % 100;
    int *pont = &x;

    printf("O endereco de memoria de %d e: 0x%x\n", x, pont);
}
