// Crie uma função que recebe um número (de 1 a 12) e retorne o mês correspondente como uma string. Porexemplo, se a entrada for 2, a função deverá retornar "fevereiro", pois este é o 2° mês.

function nomeDoMes(mes) {
    const meses = [
        'Janeiro',
        'Fevereiro',
        'Março',
        'Abril',
        'Maio',
        'Junho',
        'Julho',
        'Agosto',
        'Setembro',
        'Outubro',
        'Novembro',
        'Dezembro'
    ]

    return meses[--mes];
}

console.log(nomeDoMes(1));
console.log(nomeDoMes(4));