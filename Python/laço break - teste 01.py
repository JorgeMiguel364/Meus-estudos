"""
Programa que pede para o usuário informar vários números enquanto não informar um número negativo.
No final do programa, mostre a soma dos valores informados, e se o resultado da soma é um número
par ou ímpar
"""

soma = 0

while True:
    valor = int(input("Informe um valor: "))
    
    if valor < 0:
        break
    
    soma += valor

print(f"\nA soma de todos os valores informados é: {soma} ", end='')

if soma % 2 == 0:
    print("(par)")
else:
    print("(ímpar)")
