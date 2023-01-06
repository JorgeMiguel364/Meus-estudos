/*
    34) Construa uma função que receberá duas Strings de tamanhos variados e que retornará True ou False caso
todos os caracteres (independentemente de ser maiúsculo ou minúsculo) estejam contidos em ambas palavras
*/

var string1 = "Isso é uma frase"
var string2 = "Isso é outra frase"

function compar(str1, str2)
{
    if(str1.toUpperCase() == str2.toUpperCase())
    {
        return true
    }
    else
    {
        return false
    }
}

console.log("O retorno é: ", compar(string1, string2))