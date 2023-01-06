/*
    36) Crie duas funções que recebem dois parâmetros, um vetor com apenas valores numéricos e um número
inteiro. Faça com que a primeira função retorne outro vetor que será resultado da multiplicação de cada
elemento pelo número passado como parâmetro. A segunda função fará o mesmo da primeira se e somente se
o valor do elemento for maior que 5.
*/

var vetor = [5, 12, 78, 31, 27, 2, 1, 4, 10, 9]
var valor = 9

function primeiraFunc(vet, val)
{
    return vet * val
}

function segundaFunc(vet, val)
{
    return vet * val
}

v1 = []
v2 = []

// Preencher vetor

for(i=0; i<vetor.length; i++)
{
    v1.push(primeiraFunc(vetor[i], valor))
}
for(i=0; i<vetor.length; i++)
{
    if(vetor[i] > 5)
        v2.push(segundaFunc(vetor[i], valor))
}

// Imprimir

console.log("Primeiro vetor:")
for(i=0; i<v1.length; i++)
{
    console.log(v1[i])
}

console.log("Segundo vetor:")
for(i=0; i<v2.length; i++)
{
    console.log(v2[i])
}