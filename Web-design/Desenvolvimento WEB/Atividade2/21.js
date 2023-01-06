/*
    21. Criar uma função que receba um array de números e retorne o menor número desse array. Exemplos:
*/

var array = [20, 12, 67, 4, 91, 9, 51]

function menorNumero(array_par)
{
    return Math.min(...array_par)
}

console.log("O menor valor do array é:", menorNumero(array))