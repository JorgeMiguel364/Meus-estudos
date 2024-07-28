"""
Desenvolva um programa que leia o comprimento de três retas e diga ao
usuário se elas podem ou não formar um triângulo.
"""

reta1 = float(input("Informe a primeira reta em comprimentos: "))
reta2 = float(input("Informe a segunda reta em comprimentos: "))
reta3 = float(input("Informe a terceira reta em comprimentos: "))
print()

if reta3 + reta2 > reta1 and reta1 + reta3 > reta2 and reta1 + reta2 > reta3:
    print("É possível formar um triângulo com os dados fornecidos!")
else:
    print("Não é possível formar um triângulo com os dados fornecidos!")
