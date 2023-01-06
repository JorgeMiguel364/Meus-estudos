// uma função que receba quatro números como parâmetro (numero, minimo, maximo, inclusivo) e retorne se o parâmetro numero (o primeiro) está entre minimo  e maximo. Quando o parâmetro inclusivo for true, tenha "entre" como inclusivo, ou  seja, considerando se numero é igual a minimo ou a maximo. Caso o parâmetro  inclusivo não seja informado, seu valor padrão deverá ser false, portanto, a lógica será exclusiva, não considerando se numero é igual a minimo ou a maximo.


function estaEntre(numero, minimo, maximo, inclusivo = false) {

    if (minimo > maximo) {
        [minimo, maximo] = [maximo, minimo]  
    } 
    
    if (inclusivo) {
        minimo--;
        maximo++;
    }

    return numero > minimo && numero < maximo;

}

console.log(estaEntre(60, 100, 50));
console.log(estaEntre(16, 100, 160));
console.log(estaEntre(3, 150, 3));
console.log(estaEntre(3, 150, 3, true));