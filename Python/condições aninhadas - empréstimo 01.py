"""
Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa.
O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.

Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então
o empréstimo será negado.
"""

valor_casa = float(input("Informe o valor da casa: "))
salario_comprador = float(input("Informe o salário do comprador: "))
anos = int(input("Informe em quantos anos o pagamento será feito: "))

prestação = valor_casa / (anos * 12)
porcentagem_salario = (30/100) * salario_comprador

print(f"\nValor da casa: {valor_casa :.2f} R$")
print(f"Salário do comprador: {salario_comprador :.2f} R$")
print(f"Anos de pagamento: {anos}")
print(f"Prestação: {prestação :.2f} R$")
print(f"30% do salário: {porcentagem_salario :.2f} R$")

if prestação >= porcentagem_salario:
    print("\nO empréstimo foi negado, pois ela excede os 30% do salário do comprador!")
else:
    print("\nO empréstimo foi aprovado com sucesso!")
