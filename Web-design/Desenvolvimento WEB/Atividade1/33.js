/*
33) Crie três vetores, chamados vetorInteiro, vetorString e vetorDouble. Cada um destes vetores deverá conter
quatro valores, sendo o primeiro com valores inteiros, o segundo com strings e o terceiro com valores decimais.
Declarados os vetores, utilize a função de união concat() de duas maneiras diferentes para unir os vetores, e
mostre o resultado no console. Todos os elementos do vetor resultado deverão aparecer no console.
*/

vetorInteiro = [21, 9, 19, 25]
vetorString = ["Primeira string", "Segunda string", "Terceira string", "Quarta string"]
vetorDouble = [3.7, 11.4, 7.2, 4.3]

vetorResultado1 = vetorInteiro.concat(vetorString, vetorDouble)
vetorResultado2 = vetorInteiro.concat(vetorDouble, vetorString)

console.log(vetorResultado1)
console.log(vetorResultado2)