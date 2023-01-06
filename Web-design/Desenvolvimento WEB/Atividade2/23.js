/*Criar uma função que receba uma string como parâmetro e conte quantas palavras tem
nela.s*/


function contarPalavras(string) {
    const paraArray = string.split(" ");
    return paraArray.length;
}

console.log(contarPalavras("Sou uma frase"));
console.log(contarPalavras("Me divirto aprendendo a programar!"));