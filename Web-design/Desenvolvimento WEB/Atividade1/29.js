/*
    29) Utilizando a estrutura de repetição for, faça uma função que percorra um vetor e conte quantos números
    deste vetor estão no intervalo [10,20] (repare que o intervalo é fechado, ou seja, inclui o 10 e o 20) e quantos
    deles estão fora do intervalo, escrevendo estas informações.
*/

dentro = 0
fora = 0

vetor = [23, 10, 16, 20, 26, 47, 17, 11, 9, 6, 
         15, 29, 13, 32, 4, 1, 19, 25, 16, 26]

function intervalo()
{
    for(i=0; i<20; i++)
    {
        if((vetor[i] >= 10) && (vetor[i] <= 20))
        {
            dentro++
        }
        else
        {
            fora++
        }
    }

    console.log("Valores que estão dentro do intervalo:", dentro)
    console.log("Valores que estão fora do intervalo:", fora)
}

intervalo()