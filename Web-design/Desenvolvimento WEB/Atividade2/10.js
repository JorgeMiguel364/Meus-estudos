// Elabore uma função que recebe um número como parâmetro e retorne uma string com o símbolo "+" naquantidade especificada no parâmetro.
function simboloMais(num) {
    let str = "";
    for (let i = 0; i < num; i++) {
        str = str.concat("+");
    }
    return str;
}

console.log(simboloMais(2));
console.log(simboloMais(4));