"""
Faça um programa que leia um número de 0 a 9999 e mostre na tela
cada um dos dígitos separados
"""

numero = int(input("Informe um número: "))

unidade = numero // 1 % 10
dezena = numero // 10 % 10
centena = numero // 100 % 10
milhar = numero // 1000 % 10

print(f"Unidade: {unidade}")
print(f"Centena: {dezena}")
print(f"Dezena: {centena}")
print(f"Milhar: {milhar}")

"""
numero = str(numero)

print(f"Unidade: {numero[3]}")
print(f"Dezena: {numero[2]}")
print(f"Centena: {numero[1]}")
print(f"Milhar: {numero[0]}")
"""
