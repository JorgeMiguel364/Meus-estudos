/*
Escreva uma função que receba um argumento (um número) e execute as seguintes operações, usando as funções que você escreveu anteriormente:
    Pegue metade do número e armazene o resultado.
    Eleve ao quadrado o resultado de #1 e armazene esse resultado.
    Calcule a área de um círculo com o resultado de #2 como o raio.
    Calcule a porcentagem dessa área do resultado ao quadrado (#3).
*/

// porcentagem
function percentOf(val1, val2)
{
    var percent;
    
    percent = val1 / val2;
    percent = percent * 100;
    
    return percent;
}

// metade do numero
function halfNumber(val)
{
    var div;
    
    div = val / 2;
    
    return div;
}

// quadrado
function squareNumber(val)
{
    var potc;
    
    potc = Math.pow(val, 2);
    
    return potc;
}

// area do círculo
function areaOfCircle(raio)
{
    var area;
    
    area = Math.PI * (Math.pow(raio, 2));
    
    return area.toFixed(2);
}

function operations(val)
{
    var resul;
    
    resul = halfNumber(val);
    alert("Sua metade é:", resul);
    resul = squareNumber(resul);
    alert("Seu quadrado é:", resul);
    resul = areaOfCircle(resul);
    alert("Sua área é de: ", resul);
    resul = percentOf(resul, 2);
    alert("Sua porcentagem é de:", resul, "%");
}

operations(10);