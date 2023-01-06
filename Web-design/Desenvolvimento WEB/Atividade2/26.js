/*Desenvolva uma função que receba uma string como parâmetro e retorne essa
string somente com asconsoantes, ou seja, sem as vogais*/
function removerVogais(string) {
    const novaString = [...string].filter((ele) => {
        return (ele !== 'a' && ele !== 'e' && ele !== 'i' && ele !== 'o' && ele !== 'u');
    });
    return novaString.join('');
}

console.log(removerVogais("Cod3r"));
console.log(removerVogais("Fundamentos"));
