/* . Desenvolva uma função que recebe um objeto como parâmetro e retorne um outro 
objeto que corresponde aoao objeto recebido como parâmetro, porém com as 
posições das chaves e valores invertidas, */

function inverter(obj) {
    const objInvertido = {}
    Object.entries(obj).forEach((parChaveValor) => {
        const chave = 0, valor = 1
        return objInvertido[parChaveValor[valor]] = parChaveValor[chave];
    });
    return objInvertido;
}

console.log(inverter({ a: 1, b: 2, c: 3 }));