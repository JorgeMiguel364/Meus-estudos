/*Você está trabalhando numa aplicação de controle de despesas. Na tela dessa 
aplicação, é possível adicionar produtos ou serviços, informando nome, categoria e 
preço. Uma funcionalidade que você está desenvolvendo no momento é a de somar o total das despesas.Crie uma função que receba um array de produtos e
retorne o total das despesas.Exemplos:

*/

let soPreco = (obj) => obj.preco;
let somaPreco = (acumulador, atual) => acumulador + atual;

function despesasTotais(arrayObj) {
    let result = arrayObj.map(soPreco).reduce(somaPreco);
    return result;
}

console.log(despesasTotais([
    {nome: "Jornal Online", categoria: "Informação", preco: 89.99},
    {nome: "Cinema", categoria: "Entretenimento", preco: 150}
]));
console.log(despesasTotais([
    {nome: "Galaxy S20", categoria: "Eletrônicos", preco: 3599.99},
    {nome: "Macbook Pro", categoria: "Eletrônicos", preco: 30999.90}
]));