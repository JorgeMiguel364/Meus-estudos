"""
Faça um algoritmo que leia o preço de um produto e mostre seu novo preço,
com 5% de desconto
"""

desconto = .05

preco = float(input("Informe o preço do produto: "))

novo_preco = preco - (desconto * preco)

print(f"O preço informado com {desconto * 100 :.0f}% de desconto corresponde a {novo_preco :.2f} R$")
