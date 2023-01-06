/*
  22) Criar uma função para calcular o valor a ser pago de anuidade de uma associação. A função recebe como
parâmetro um inteiro que representa o mês (1 - janeiro, 2 - fevereiro…) que foi paga e o valor da anuidade. A
anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (sob o regime de juros
compostos). O retorno deve ser o valor a ser pago para o respectivo mês escolhido.
*/

const juros = .05

function anuidade(mes, valor)
{
    for(i=0; i<12; i++)
    {
        valor = valor * juros;
    }
    
    return valor;
}

console.log(anuidade(1, 100))