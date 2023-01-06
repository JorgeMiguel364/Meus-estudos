#include <stdio.h>
#include <stdlib.h>

/* Resumo de ponteiros */

int main()
{
    // Declara��o das vari�veis
    int vl1 = 15, vl2 = 25;

    // Declara��o dos ponteiros
    int *pt1;
    int *pt2;

    pt1 = &vl1; // *pt1 armazena o endere�o de vl1
    pt2 = &vl2; // *pt2 armazena o endere�o de vl2

    printf("0x%x\n", &vl1); // &vl1(com &) mostra o valor do endere�o de vl1
    printf("0x%x\n", pt1); // pt1(sem *) mostra o valor do endere�o de vl1
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    printf("0x%x\n\n", &pt1); // &pt1(com &) mostra o valor do endere�o de pt1


    //----------------------------------------------------------------------


    // Altera o conte�do da vari�vel vl1
    *pt1 = 30;
    printf("%d\n", *pt1);

    // Adiciona 5 a vari�vel vl1
    *pt1 += 5; // Isso � o mesmo que *pt1 = *pt1 + 5
    printf("%d\n\n", *pt1);


    //----------------------------------------------------------------------


    // Desloca 1 posi��o a mais na mem�ria de pt1
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endere�o armazenado, que indica para a vari�vel vl1
    pt1++;
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endere�o armazenado incrementado +1, n�o mais indicado para a vari�vel vl1
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido no novo endere�o

    // Desloca 1 posi��o a menos na mem�ria
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endere�o armazenado,
    pt1--;
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endere�o armazenado decrementado -1, agora indicado para a vari�vel vl1
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido no novo endere�o


    //----------------------------------------------------------------------


    // Incrementa +1 no conte�do do ponteiro
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    (*pt1)++;
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido em vl1, incrementado +1

    // Decrementa -1 no conte�do do ponteiro
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    (*pt1)--;
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido em vl1, decrementado +1











}
