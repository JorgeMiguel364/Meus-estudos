/*A fim de criar um mecanismo de busca para sua aplicação, você precisa iniciar 
criando uma função paraidentificar palavras semelhantes.
Escreva uma função que recebe como primeiro parâmetro uma palavra e, como
segundo parâmetro, um array
de strings. A função deverá filtrar as palavras do array que contêm nelas a string do primeiro parâmetro*/

function buscarPalavrasSemelhantes(palavra, array) {
    const result = array.filter((elemento) => elemento.includes(palavra));
    return result;
}

console.log(buscarPalavrasSemelhantes("pro", ["programação", "mobile", "profissional"]));
console.log(buscarPalavrasSemelhantes("python", ["javascript", "java", "c++"]));