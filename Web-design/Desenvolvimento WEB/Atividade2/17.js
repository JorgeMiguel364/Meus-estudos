/*
    17. Escreva uma função que receba um array de números e retornará a soma de todos
*/

var array = [24,27,12,16,65,27,68]

function somarVetor(array)
{
    let somaArray = 0
    
    for(let i=0; i<array.length; i++)
    {
        somaArray += array[i]
    }
    
    return somaArray
}

console.log("A soma de todos os elementos do array é: ", somarVetor(array))