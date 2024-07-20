"""
Crie um programa que leia o nome de uma pessoa e diga se ela
tem "Silva" no nome
"""

nome = str(input("Informe o nome completo: "))

print("\nO nome possui Silva?")
print("Silva" in nome.title())
