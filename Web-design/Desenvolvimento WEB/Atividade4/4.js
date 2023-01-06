//Escreva uma função chamada areaOfCircle que receberá um argumento (o raio), calcule a área com base nisso e retorne o resultado. Ele também deve registrar uma string como "A área de um círculo com raio 2 é 12,566370614359172".

function areaOfCircle(raio)
{
    var area;
    
    area = Math.PI * (Math.pow(raio, 2));
    
    alert("A área de um círculo com raio", raio, "é:", area.toFixed(2));
}

areaOfCircle(3);