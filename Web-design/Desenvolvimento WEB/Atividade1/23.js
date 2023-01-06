/*
23) Escreva um algoritmo que leia o código de um aluno e suas três notas. Calcule a média ponderada do
aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do
aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e
"REPROVADO" se a média for menor que 5. Repita a operação até que o código lido seja negativo.
*/

cod = 566
not1 = 5
not2 = 7
not3 = 4

var media

while(cod >= 0)
{
    if(not1 == Math.max(not1, not2, not3))
        media =+ not1 * 4
    else
        media =+ not1 * 3
    
    if(not2 == Math.max(not1, not2, not3))
        media =+ not2 * 4
    else
        media =+ not2 * 3
    
    if(not3 == Math.max(not1, not2, not3))
        media =+ not3 * 4
    else
        media =+ not3 * 3
        
    media = media / 3
        
    console.log("Código do aluno:", cod);
    console.log("Nota 1:", not1);
    console.log("Nota 2:", not2);
    console.log("Nota 3:", not3);
    console.log("Média:", media);
    
    if(media >= 5)
        console.log("APROVADO\n\n")
    else
        console.log("REPROVADO\n\n")
}