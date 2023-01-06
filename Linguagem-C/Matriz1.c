#include <stdio.h>
#include <time.h>

int main()
{
    int l, c, matriz3x3[3][3];

    srand(time(NULL));

    for (l=0; l<3; l++)
    {
        for (c=0; c<3; c++)
        {
            matriz3x3[l][c] = rand() % 100;
        }
    }

    printf("Os valores atribuidos a matriz sao:\n\n");

    for(l=0; l<3; l++)
    {
        for(c=0; c<3; c++)
        {
            printf("%d, ", matriz3x3[l][c]);
        }
        printf("\n");
    }

    return 0;
}
