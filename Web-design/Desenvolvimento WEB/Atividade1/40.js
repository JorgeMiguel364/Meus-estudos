/*
40) Faça uma função que receba como parâmetro um vetor de notas e mostre os conceitos de cada uma de
modo que de 0,0 a 4,9 seja atribuído o conceito D, de 5,0 a 6,9 seja atribuído o conceito C, de 7,0 a 8,9 o
conceito B e de 9,0 a 10,0 o conceito A.
*/

var notas = [3.5, 5.7, 7.4, 9.2, 2.1, 6.6]

function conceito(vetNotas)
{
    console.log("Notas e conceitos\n");
    
    for(i=0; i<vetNotas.length; i++)
    {
        console.log("Nota:", vetNotas[i])
        console.log("Conceito:")
        
        if((vetNotas[i] >= 0.0) && (vetNotas[i] <= 4.9))
            console.log("D")
        else if((vetNotas[i] >= 5.0) && (vetNotas[i] <= 6.9))
            console.log("C")
        else if((vetNotas[i] >= 7.0) && (vetNotas[i] <= 8.9))
            console.log("B")
        else if((vetNotas[i] >= 9.0) && (vetNotas[i] <= 10.0))
            console.log("A")
        else
            console.log("Nota inválida")
    }
}

conceito(notas)