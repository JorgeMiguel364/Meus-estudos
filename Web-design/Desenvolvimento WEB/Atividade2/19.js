/*
    19. Numa aplicação Web de investimento financeiro da qual você faz parte da 
    equipe de desenvolvimento, pretende-se adicionar a funcionalidade de
    calcular a média de um conjunto de números informados pelo usuário.
    Com o intuito de realizar esse cálculo, crie uma função que receba um 
    array com uma quantidadeindeterminada de números e retorne a média
    simples desses números.

*/

var array = [12, 300, 65, 299, 40]

function mediaArray(array)
{
    let media = 0
    
    for(i=0; i<array.length; i++)
    {
        media += array[i]
    }
    
    media /= array.length
    
    return media
}

console.log("A média do array informado é:", mediaArray(array))