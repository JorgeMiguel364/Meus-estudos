/*
    20. Faça uma função que recebe a base e a altura de um triângulo e retorne a área desse triângulo. A precisão deverá ser de duas casas decimais, arredondando se necessário.
*/

var base = 9.25, altura = 13.1

function areaTriangulo(b, a)
{
    return (b * a) / 2
}

console.log("A área do triângulo", base, "x", altura, "é igual a", areaTriangulo(base, altura).toFixed(2))