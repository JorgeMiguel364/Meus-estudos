/*
    39) Crie uma função que receba dois vetores de igual tamanho e troque seus elementos de modo que o
primeiro elemento do vetorA passe a ser o primeiro elemento do vetorB e vice versa e assim sucessivamente.
Faça a troca sem utilizar uma variável auxiliar.
*/

var vet1 = [2, 4, 7, 8, 1, 5, 10, 15]
var vet2 = [5, 9, 12, 17, 20, 3, -4, 30]
var vetAuxiliar = []

function inverterVetor(v1, v2)
{
    
    for(i=0; i<v1.length; i++)
    {
        vetAuxiliar.push(v1[i])
    }
    
    console.log("Vetores invertidos:")
    console.log("Primeiro vetor:")
    for(i=0; i<v1.length; i++)
    {
        vet1[i] = vet2[i]
        console.log(vet1[i]);
    }
    
    console.log("\nSegundo vetor:")
    for(i=0; i<v2.length; i++)
    {
        vet2[i] = vetAuxiliar[i]
        console.log(vet2[i]);
    }
}

inverterVetor(vet1, vet2)