"""
Faça um programa que leia um número inteiro e diga
se ele é ou não um número primo
"""

div = 0

val = int(input("Informe um valor: "))

print(f"\nO número {val} é divisível por:")

for i in range(1, val+1):
    if val % i == 0:
        print(f"{i}, ", end="")
        div += 1
        
if div == 2:
    print("\n\nÉ um valor PRIMO!")
else:
    print("\n\nNão é um valor PRIMO!")
