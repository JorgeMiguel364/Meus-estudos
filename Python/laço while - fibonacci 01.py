"""
Escreva um programa que leia um número n inteiro qualquer e mostre na tela os
n primeiros elementos de uma Sequência de Fibonacci. Ex:
0 - 1 - 1 - 2 - 3 - 5 - 8
"""

contador = 0
termo0 = 0
termo1 = 1

n = int(input("Informe a quantidade de termos: "))

print(f"{termo0}, {termo1}, ", end="")

while contador < n:
    termo2 = termo0 + termo1
    termo0 = termo1
    termo1 = termo2
    contador += 1
    
    print(f"{termo2}, ", end="")
