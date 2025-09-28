#include <stdio.h>
#include <stdlib.h>

union valores
{
    int x, y;
};

int main()
{
    union valores v1;

    v1.x = 8;
    v1.y = 20;

    printf("O valor de x e: %d\n", v1.x);
    printf("O valor de y e: %d\n\n", v1.y);

    system("pause");

    return 0;
}
