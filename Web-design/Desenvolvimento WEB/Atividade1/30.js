/**
 * 30) Escreva um algoritmo que percorre um vetor de inteiros e defina o maior e menor valor dentro do vetor.
 */

vetor = [20, 6, 12, 30, 41, 50, 10, 7, 2, 31]

menor = vetor[0], maior = vetor[0]

for(i=0; i<10; i++)
{
    if(vetor[i] < menor)
        menor = vetor[i]
    else if (vetor[i] > maior)
        maior = vetor[i]
}

console.log("Maior valor:", maior);
console.log("Menor valor:", menor);