// Elabore uma função que receba um array de números e retorne um array que tenha todos os números que são pares e que também tenham índices pares.


const arreyFinal = (value, indice) => indice % 2 === 0 && value % 2 == 0;

function receberSomenteOsParesDeIndicePares(array) {
    return array.filter(arreyFinal);
}

console.log(receberSomenteOsParesDeIndicePares([1, 2, 3, 4]));
console.log(receberSomenteOsParesDeIndicePares([10, 70, 22, 43]));