/*
    28) Ler um vetor de números inteiros e imprimir quantos são pares e quantos são ímpares.
*/

v1 = [8, 3, 5, 12, 16, 13, 1, 4, 21, 19]

par = 0, imp = 0

for(i=0; i<10; i++)
{
    if(v1[i] % 2 == 0){
        par++
    }
    else{
        imp++
    }
}

console.log("Valores pares:", par)
console.log("Valores ímpares: ", imp)