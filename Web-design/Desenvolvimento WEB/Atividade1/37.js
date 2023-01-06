/*
    37) Escreva duas funções, uma para progressão aritmética e uma para progressão geométrica que recebam
como parâmetros um número n (número de termo), a1 (o primeiro termo) e r (a razão) e escreva os n termos ,
bem como a soma dos elementos.
*/

var n=7, a1=4, r=3

function progAritmética(n, a1, r)
{
    soma = a1
    
    console.log("Progressão aritmética:")
    console.log(soma)
    for(i=0; i<n; i++)
    {
        console.log(soma += r)
    }
    
    console.log("A soma dessa progressão aritmética é:", ((a1+soma)*n)/2)
}

function progGeométrica(n, a1, r)
{
    soma = a1
    
    console.log("\nProgressão geométrica:")
    console.log(soma)
    for(i=0; i<n; i++)
    {
        console.log(soma *= r)
    }
    
    console.log("A soma dessa progressão geométrica é:", (a1*(Math.pow(r,n)-1))/(r-1))
}

progAritmética(n, a1, r)
progGeométrica(n, a1, r)