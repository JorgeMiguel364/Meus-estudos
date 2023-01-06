// Crie uma função que receba um array de elementos e retorne um array somente com os números presentes no array recebido como parâmetro.

const isNumber = nome => typeof nome == 'number'

function filtrarNumeros(array) {
    return array.filter(isNumber);
}

console.log(filtrarNumeros(["Javascript", 1, "3", "web", 20]));
console.log(filtrarNumeros(['a', 'c']));