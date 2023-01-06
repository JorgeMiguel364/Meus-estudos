/*
    38) Escreva uma função que receba dois parâmetros início e fim. Essa função deve imprimir todos os números
ímpares que estão entre esses valores. Por padrão os valores devem ser 0 para início e 100 para fim. Atente
para corrigir a ordem dos parâmetros caso a função receba o valor maior antes do menor.
*/

var v1=0, v2=100

function imprimirImpares(inicio, fim)
{
    if(inicio > fim)
    {
        var aux = inicio
        
        inicio = fim
        fim = aux
    }
    
    console.log("Os valores ímpares são:")
    for(i=inicio; i<=fim; i++)
    {
        if(i % 2 != 0)
            console.log(i)
    }
}

imprimirImpares(v1, v2)