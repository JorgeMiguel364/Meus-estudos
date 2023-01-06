/**
 * 31) Escrever um algoritmo que percorre um vetor de inteiros, conta quantos números negativos há nesse vetor
   e imprime a quantidade no console.
 */

qt_negativos = 0

vetor = [16, -3, 27, -21, -9, 34, 51, 8, -8, 10]

for(i=0; i<10; i++)
{
    if(vetor[i] < 0)
        qt_negativos++
}

console.log("Quantidade de valores negativos:", qt_negativos)