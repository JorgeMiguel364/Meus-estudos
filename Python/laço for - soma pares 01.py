"""
Desenvolva um programa que leia seis números inteiros e mostre a soma apenas daqueles
que forem pares. Se o valor digitado for ímpar, desconsidere-o
"""

soma_pares = 0

for cont in range(0, 6):
    valor = int(input("Informe um valor: "))
    
    if valor % 2 == 0:
        soma_pares += valor
        
if soma_pares == 0:
    print("Não foi somado nenhum valor a variável!")
else:
    print(f"A soma dos valores pares é igual a: {soma_pares}")
