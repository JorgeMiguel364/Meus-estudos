"""
Crie um programa que leia vários números inteiros pelo teclado. O programa só vai parar quando o
usuário digitar o valor 999, que é a condição de parada. No final, mostre quantos números foram
digitados e qual foi a soma entre eles (desconsiderando o flag).
"""

soma = contador = 0

while True:
    numero = int(input("Informe um número (999 para sair) "))
    
    if numero == 999:
        break
    
    contador += 1
    soma += numero

print(f"\nQuantidade de números informados: {contador}")
print(f"A soma dos valores é igual a: {soma}")
