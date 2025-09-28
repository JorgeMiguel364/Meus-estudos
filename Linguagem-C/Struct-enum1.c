#include <stdio.h>
#include <stdlib.h>

enum sequencia{primeiro, segundo, terceiro, quarto, quinto};

int main()
{
    enum sequencia sq;

    sq = quarto;
    printf("O valor correspondente e: %d\n\n", sq);

    system("pause");

    return 0;
}
