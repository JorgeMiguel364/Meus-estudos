#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int col, lin, matz[3][3];

    for(;;)
    {
        for(lin=0; lin<3; lin++)
        {
            for(col=0; col<3; col++)
            {
                matz[lin][col] = rand() % 100;
            }
        }

        for(lin=0; lin<3; lin++)
        {
            for(col=0; col<3; col++)
            {
                printf("%.2d, ", matz[lin][col]);
            }
            printf("\n");
        }

        printf("\n");

        for(lin=0; lin<3; lin++)
        {
            for(col=0; col<3; col++)
            {
                printf("0x%x, ", &matz[lin][col]);
            }
            printf("\n");
        }

        printf("\n");
        system("pause");

        printf("\n");
    }
}
