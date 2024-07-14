"""
Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e
mostre quantos dólares ela pode comprar

Considere R$ 1,00 = US$ 3,27
"""

dolares = 3.27

reais = float(input("Informe um valor em reais (R$): "))

print("\n{:.2f} (R$) corresponde a {:.2f} (US$)" .format(reais, dolares * reais))
