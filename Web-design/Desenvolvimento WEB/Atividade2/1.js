// 1. Crie uma função que retorna a string "Olá, " concatenada com um argumento text
//(a ser passado para a função) e com ponto de exclamação "!" no final

function cumprimentar(str) {
    return "Olá, ".concat(str, "!");
}

console.log(cumprimentar("Jorge"));
console.log(cumprimentar("Pedro"));