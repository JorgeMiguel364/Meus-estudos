// Escreva uma função que receba dois parâmetros. O primeiro parâmetro é o elemento que repetirá, enquanto que o segundo será o número de vezes que haverá repetição. Um array será retornado.
function repetir(elemento, vezes) {
    return Array(vezes).fill(elemento)
}

console.log(repetir("Código", 2));
console.log(repetir(7, 3));