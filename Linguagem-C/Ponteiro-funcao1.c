#include <stdio.h>
#include <stdlib.h>

int mult(int *x)
{
    return *x * 5;
}

int main()
{
    int val1, val2;

    printf("Informe um valor: ");
    scanf("%d", &val1);

    val2 = mult(&val1);

    printf("\nO resultado e: %d\n", val2);
}
