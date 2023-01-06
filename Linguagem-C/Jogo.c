#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>

#define MAX_LINHA 15
#define MAX_COLUNA 60

#define ESPAC "\t\t\t\t\t\t"
#define AMAR "\x1b[33m"
#define VERDE "\x1b[32m"
#define BRANCO "\x1b[37m"
#define RESET "\x1b[0m"
#define BG_AZUL "\x1b[44m"
#define BG_PRET "\x1b[40m"

int main()
{
    srand(time(NULL));
    int ox = MAX_COLUNA / 2, oy = MAX_LINHA - 2;
    int px = 1, py = 1;
    int mx = (int)(MAX_COLUNA * 0.7), my = (int)(MAX_LINHA * 0.7);
    int x, y;
    char comando;
    int movimentoRealizado;
    int dificuldade = 1;

    for(;;)
    {
        system("CLS");

        printf(BG_AZUL BRANCO"\t\t\t\t\tJogos Digitais - Fatec Americana\n");
        printf(BG_PRET AMAR ESPAC"--- Grupo 7 ---\n");

        printf(AMAR ESPAC"Filipe Goncalves\n");
        printf(AMAR ESPAC"Gustavo Baratella\n");
        printf(AMAR ESPAC"Jorge Miguel\n");
        printf(AMAR ESPAC"Matheus Felipe\n");
        printf(AMAR ESPAC"Pedro Sagradim\n");
        printf(AMAR ESPAC"Pedro Theobaldo\n\n");

        printf(RESET ESPAC"   Nivel: %d\n", dificuldade);

        for(y=0; y<MAX_LINHA; y++)
        {
            printf("\t\t\t");
            for(x=0; x<MAX_COLUNA; x++)
            {
                if(y == 0 || x == 0 || x == MAX_COLUNA -1 || y == MAX_LINHA - 1)
                    printf("%c", 177);
                else if(x == px && y == py)
                    printf("%c", 1);
                else if(x == mx && y == my)
                    printf("%c", 15);
                else if(x == ox && y == oy)
                    printf("%c", 219);
                else{
                    if(y == (int) (MAX_LINHA * 0.3) && x <= dificuldade && x < MAX_COLUNA - 2){
                        for (int i=0; i<3; i++){
                            printf("%c", 177);
                            i++;
                        }

                    }else if(y == (int) (MAX_LINHA * 0.6) && x >= (MAX_COLUNA - 1) - dificuldade && x > 2){
                        printf("%c", 177);
                    }else{
                        printf("%c", 32);
                    }

                    /*if(y == (int) (MAX_LINHA * 0.5) && x <= dificuldade && x < MAX_COLUNA - 2){
                        printf("%c", 177);
                    }else if(y == (int) (MAX_LINHA * 0.8) && x >= (MAX_COLUNA - 1) - dificuldade && x > 2){
                        printf("%c", 177);
                    }else{
                        printf("%c", 32);
                    }*/
                }
            }
            printf("\n");
        }
        printf("\n");

        printf(VERDE "\t\t   --- Comando: W(cima)\tD(direita)\tS(baixo)\tA(esquerda) ---\n");

        do
        {
            comando = getch();

        } while ((comando != 'w') && (comando != 's') && (comando != 'a') && (comando != 'd'));

        movimentoRealizado = 1;

        switch(comando)
        {
            case 'w':
                py -= 1;
                if(py<1)
                {
                    py=1;
                    movimentoRealizado = 0;
                }else if(py == (int) (MAX_LINHA * 0.3)){
                    if(px <= dificuldade && px != MAX_COLUNA - 2){
                        py+=1;
                        movimentoRealizado = 0;
                    }
                }else if(py == (int) (MAX_LINHA * 0.6)){
                    if(px >= (MAX_COLUNA - 1) - dificuldade && px != 1){
                        py+=1;
                        movimentoRealizado = 0;
                    }
                }
                break;

            case 's':
                py += 1;
                if (py >= MAX_LINHA - 1)
                {
                    py=MAX_LINHA - 2;
                    movimentoRealizado = 0;
                }else if(py == (int) (MAX_LINHA * 0.3)){
                    if(px <= dificuldade && px != MAX_COLUNA - 2){
                        py-=1;
                        movimentoRealizado = 0;
                    }
                }else if(py == (int) (MAX_LINHA * 0.6)){
                    if(px >= (MAX_COLUNA - 1) - dificuldade && px != 1){
                        py-=1;
                        movimentoRealizado = 0;
                    }
                }
                break;

            case 'a':
                px -= 1;
                if (px<1)
                {
                    px=1;
                    movimentoRealizado = 0;
                }else if(px <= dificuldade && py == (int) (MAX_LINHA * 0.3)){
                    px+=1;
                    movimentoRealizado = 0;
                }
                break;

            case 'd':
                px += 1;
                if (px >= MAX_COLUNA -1)
                {
                    px = MAX_COLUNA - 2;
                    movimentoRealizado = 0;
                }else if(px >= (MAX_COLUNA - 1) - dificuldade && py == (int) (MAX_LINHA * 0.6)){
                    px-=1;
                    movimentoRealizado = 0;
                }
                break;
        }

        if(movimentoRealizado == 1)
        {
            int direcao = rand()%4;

            switch(direcao)
            {
                case 0:
                    my -= dificuldade;
                    if (my<1){
                        my = 1;
                    }else if(my == (int) (MAX_LINHA * 0.3)){
                        if(mx <= dificuldade){
                            my++;
                        }
                    }else if(my == (int) (MAX_LINHA * 0.6)){
                        if(mx >= (MAX_LINHA - 1) - dificuldade){
                            my++;
                        }
                    }
                    break;

                case 1:
                    my += dificuldade;
                    if (my >= MAX_LINHA - 1){
                        my = MAX_LINHA - 2;
                    }else if(my == (int) (MAX_LINHA * 0.3)){
                        if(mx <= dificuldade){
                            my--;
                        }
                    }else if(my == (int) (MAX_LINHA * 0.6)){
                        if(mx >= (MAX_LINHA - 1) - dificuldade){
                            my--;
                        }
                    }
                    break;

                case 2:
                    mx -= dificuldade;
                    if (mx<1){
                        mx = 1;
                    }else if(my == (int) (MAX_LINHA * 0.3)){
                        if(mx <= dificuldade){
                            mx += dificuldade;
                        }
                    }else if(my == (int) (MAX_LINHA * 0.6)){
                        if(mx >= (MAX_LINHA - 1) - dificuldade){
                            mx += dificuldade;
                        }
                    }
                    break;

                case 3:
                    mx += dificuldade;
                    if (mx >= MAX_COLUNA - 1){
                        mx = MAX_COLUNA - 2;
                    }else if(my == (int) (MAX_LINHA * 0.3)){
                        if(mx <= dificuldade){
                            mx -= dificuldade;
                        }
                    }else if(my == (int) (MAX_LINHA * 0.6)){
                        if(mx >= (MAX_LINHA - 1) - dificuldade){
                            mx -= dificuldade;
                        }
                    }
                    break;
            }
        }

        if (px == mx && py == my)
        {
            printf("\n\nGAME OVER\n");
            break;
        }
        else if (px == ox && py == oy)
        {
            printf("\n\nYOU WIN\n");
            system("PAUSE");

            dificuldade++;

            px=1;
            py=1;

            mx = (int)(MAX_COLUNA * 0.7);
            my = (int)(MAX_LINHA * 0.7);
        }
    }

    system("PAUSE");

    return 0;
}
