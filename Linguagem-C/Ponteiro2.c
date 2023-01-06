#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int x = rand() % 100;

    printf("O endereco de memoria do valor %d e: 0x%x\n\n", x, &x);

    system("pause");
}
