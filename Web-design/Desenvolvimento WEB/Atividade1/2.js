//*02) Os triângulos podem ser classificados em 3 tipos quanto ao tamanho de seus lados:
//Equilátero: Os três lados são iguais. Isósceles: Dois lados iguais. Escaleno: Todos os lados são diferentes.
//Crie uma função que recebe os comprimentos dos três lados de um triângulo e retorne sua classificação quanto
//ao tamanho de seus lados. (Neste exemplo deve-se abstrair as condições matemáticas de existência de um triângulo).
const typeTriangle = (a, b, c) => {
  if (a < (b + c) && b < (a + c) && c < (a + b)) {

    if (a == b && b == c) {
      console.log('Triângulo equilátero');
    }
    else if (a == b || a == c || c == b) {
      console.log('Triângulo isóceles');
    }
    else {
      console.log('Triângulo escaleno');
    }
  }
  else {
    console.log('Nenhuma medida foi informada!');
  }

}

typeTriangle(10, 5, 10);
typeTriangle(10, 10, 10);
typeTriangle(3, 4, 5);
typeTriangle();
