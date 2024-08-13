"""
Faça um programa que leia o peso de cinco pessoas. No final,
mostre qual foi o maior e o menor peso lidos.
"""

for i in range(0, 5):
    valor = float(input(f"{i + 1} - Informe o peso da pessoa: "))
    
    if i == 0:
        maior = menor = valor
    elif valor > maior:
        maior = valor
    elif valor < menor:
        menor = valor

print(f"\nO maior peso lido foi: {maior} Kg")
print(f"O menor peso lido foi: {menor} Kg")
