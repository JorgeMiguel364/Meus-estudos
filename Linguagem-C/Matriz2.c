#include <stdio.h>
#include <time.h>

int main()
{
    int l, c, ql, qc;

    srand(time(NULL));

    printf("Defina a dimensao da matriz.\n\n");

    do
    {
        printf("Linhas: ");
        scanf("%d", &l);
    }while (l > 50);


    printf("\n");

    do
    {
        printf("Colunas: ");
        scanf("%d", &c);
    }while (c > 50);

    printf("\n%d X %d\n\n", l, c);

    int matrz[l][c];

    for (ql=0; ql<l; ql++)
    {
        for (qc=0; qc<c; qc++)
        {
            matrz[ql][qc] = rand() % 100;
        }
    }

    for (ql=0; ql<l; ql++)
    {
        for (qc=0; qc<c; qc++)
        {
            printf(" %.2d |", matrz[ql][qc]);
        }
        printf("\n");
    }

    return 0;
}
