//Crie uma função que receba dois números e retorne se o primeiro é maior ou igual ao segundo.Exemplos:

function maiorOuIgual(num1, num2) {
    return typeof num1 === 'number' && typeof num2 === 'number' && num1 >= num2;
}

console.log(maiorOuIgual(0, 0));
console.log(maiorOuIgual(0, '0'));
console.log(maiorOuIgual(5, 1));