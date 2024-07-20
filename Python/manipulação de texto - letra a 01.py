"""
Faça um programa que leia uma frase pelo teclado e mostre:
Quantas vezes aparece a letra "A"
Em que posição ela aparece pela primeira vez
Em que posição ela aparece pela última vez
"""

frase = str(input("Informe uma frase: "))

frase = frase.lower()

print(f"\nQuantidade de vezes em que a letra 'a' aparece: {frase.count('a')}")
print(f"Posição em que a letra 'a' aparece pela primeira vez: {frase.find('a')}")
print(f"Posição em que a letra 'a' aparece pela última vez: {frase.rfind('a')}")
