#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));

    int col, lin, x, y, mat[5][5];

    for(;;)
    {
        for (lin=0; lin<5; lin++)
        {
            for(col=0; col<5; col++)
            {
                mat[lin][col] = rand() % 100;
            }
        }

        for(lin=0; lin<5; lin++)
        {
            for(col=0; col<5; col++)
            {
                printf("%.2d, ", mat[lin][col]);
            }
            printf("\n");
        }

        printf("\n");

        do
        {
            printf("Informe as coordenadas(x/y): ");
            scanf("%d %d", &x, &y);
        }while((x > 4) || (x < 0) || (y > 4) || (y < 0));

        printf("\nValor: %d. Endereco: 0x%x", mat[x][y], &mat[x][y]);

        printf("\n\n");
        system("pause");
        printf("\n");
    }
}
