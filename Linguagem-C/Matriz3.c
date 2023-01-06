#include <stdio.h>
#include <time.h>
#include <conio.h>

int main()
{
    srand(time(NULL));
    printf("Defina a dimensao da matriz.\n\n");

    for ( ; ; )
    {
        int l, c, ql, qc;

        do
        {
            printf("Linhas: ");
            scanf("%d", &l);
        }while(l > 25);

        printf("\n");

        do
        {
            printf("Colunas: ");
            scanf("%d", &c);
        }while(c > 25);

        printf("\n%dX%d\n\n", l, c);

        int matz[l][c];

        for (ql=0; ql<l; ql++)
        {
            for (qc=0; qc<c; qc++)
            {
                matz[ql][qc] = rand() % 100;
            }
        }

        for (ql=0; ql<l; ql++)
        {
            for (qc=0; qc<c; qc++)
            {
                printf(" %.2d|", matz[ql][qc]);
            }

            printf("\n");
        }

        printf("\n");
        getch();

        printf("----------------------------------------------------------------------------------------------------");
        printf("\n\n");
    }

    return 0;
}
