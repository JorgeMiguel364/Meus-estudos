/*
    35) Crie dois vetores chamados vetorPilha e vetorAdiciona. Inicialmente, o vetorPilha conterá cinco elementos
inteiros: [1, 2, 3, 4, 5]. Você deverá adicionar os valores contidos no vetorAdiciona [6, 7, 8, 9, 10] ao vetor pilha
e mostrá-los no console. É importante lembrar que o método Push retorna somente o tamanho do Vetor. Ao
final das operações imprima os vetores no console.
*/

vetorPilha = [1, 2, 3, 4, 5]
vetorAdiciona = [6, 7, 8, 9, 10]

console.log("VetorPilha:")
for(i=0; i<vetorPilha.length; i++)
{
    console.log(vetorPilha[i])
}

console.log("VetorAdiciona:")
for(i=0; i<vetorAdiciona.length; i++)
{
    console.log(vetorPilha[i])
}

vetorUniao = vetorPilha.concat(vetorAdiciona)

console.log("União de vetores:")
for(i=0; i<vetorUniao.length; i++)
{
    console.log(vetorUniao[i])
}