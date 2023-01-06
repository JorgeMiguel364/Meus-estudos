#include <stdio.h>
#include <time.h>

int main()
{
    int vetor[10];

    srand(time(NULL));

    for (int i = 0; i < 10; i++)
    {
        vetor[i] = rand() % 200;
    }

    printf("Os valores atribuidos ao vetor sao:\n\n");

    for (int a = 0; a < 10; a++)
    {
        printf("%d, ", vetor[a]);
    }

    printf("\n");
}
