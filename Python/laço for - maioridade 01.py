from datetime import date

"""
Crie um programa que leia o ano de nascimento de sete pessoas. No final, mostre
quantas pessoas ainda não atingiram a maioridade e quantas já são maiores
"""

maior = 0
menor = 0

for i in range(0, 7):
    nasc = int(input(f"{i + 1} - Informe o ano de nascimento do indivíduo: "))
    
    if date.today().year - nasc <= 17:
        menor += 1
    elif date.today().year - nasc > 17:
        maior += 1

print(f"\nPessoas que são maiores: {maior}")
print(f"Pessoas que são menores: {menor}")
