//Escreva uma função chamada percentOf que receberá dois números, descubra qual porcentagem o primeiro número representa do segundo número e retorne o resultado. Ele também deve registrar uma string como "2 é 50% de 4".

function percentOf(val1, val2)
{
    var percent;
    
    percent = val1 / val2;
    percent = percent * 100;
    
    alert("", val1, "corresponde a", percent.toFixed(2), "% de", val2);
}

percentOf(2, 4);