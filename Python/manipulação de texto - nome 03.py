"""
Faça um programa que leia o nome completo de uma pessoa, mostrando em seguida
o primeiro e o último nome separadamente
"""

nome = str(input("Informe o nome completo: "))

nome = nome.split()

print(f"\nO primeiro nome é: {nome[0]}")
print(f"O último nome é: {nome[-1]}")
