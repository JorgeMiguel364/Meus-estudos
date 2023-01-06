#include <stdio.h>
#include <stdlib.h>

/* Resumo de ponteiros */

int main()
{
    // Declaração das variáveis
    int vl1 = 15, vl2 = 25;

    // Declaração dos ponteiros
    int *pt1;
    int *pt2;

    pt1 = &vl1; // *pt1 armazena o endereço de vl1
    pt2 = &vl2; // *pt2 armazena o endereço de vl2

    printf("0x%x\n", &vl1); // &vl1(com &) mostra o valor do endereço de vl1
    printf("0x%x\n", pt1); // pt1(sem *) mostra o valor do endereço de vl1
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    printf("0x%x\n\n", &pt1); // &pt1(com &) mostra o valor do endereço de pt1


    //----------------------------------------------------------------------


    // Altera o conteúdo da variável vl1
    *pt1 = 30;
    printf("%d\n", *pt1);

    // Adiciona 5 a variável vl1
    *pt1 += 5; // Isso é o mesmo que *pt1 = *pt1 + 5
    printf("%d\n\n", *pt1);


    //----------------------------------------------------------------------


    // Desloca 1 posição a mais na memória de pt1
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endereço armazenado, que indica para a variável vl1
    pt1++;
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endereço armazenado incrementado +1, não mais indicado para a variável vl1
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido no novo endereço

    // Desloca 1 posição a menos na memória
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endereço armazenado,
    pt1--;
    printf("0x%x\n", pt1); // pt1(sem *) mostra o seu atual endereço armazenado decrementado -1, agora indicado para a variável vl1
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido no novo endereço


    //----------------------------------------------------------------------


    // Incrementa +1 no conteúdo do ponteiro
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    (*pt1)++;
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido em vl1, incrementado +1

    // Decrementa -1 no conteúdo do ponteiro
    printf("%d\n", *pt1); // *pt1(com *) mostra o valor contido em vl1
    (*pt1)--;
    printf("%d\n\n", *pt1); // *pt1(com *) mostra o valor contido em vl1, decrementado +1











}
