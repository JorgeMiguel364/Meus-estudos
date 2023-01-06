/*
    16. A fim de manter o calendário anual ajustado com o movimento de translação 
da Terra, criou-se os anosbissextos, que têm 366 dias em vez dos 365 
presentes nos anos normais.
Para determinar se um ano é bissexto, é necessário saber se ele é multiplo de 4. Não
pode ser múltiplo de 100,exceto se for também múltiplo de 400.
Com isso em mente, desenvolva uma função que recebe um número correspondente
a um ano e retorna se eleé bissexto ou não.
*/

var ano = 2020

function anoBissexto(ano)
{
    if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 ==0))
    {
        return true
    }
    else
    {
        return false
    }
}

if(anoBissexto(ano) == true)
    console.log("", ano, "é um ano bissexto")
else
    console.log("", ano, "não é um ano bissexto")

