"""
Crie um programa que leia o nome de uma cidade e diga se ela
começa ou não com o nome "Santo"
"""

cidade = str(input("Informe o nome de uma cidade: "))

cidade = cidade.split()

print("\nO nome da cidade começa com Santo?")
print("Santo" in cidade[0].title())
