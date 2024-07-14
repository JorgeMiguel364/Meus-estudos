"""
Faça um algoritmo que leia o salário de um funcionário e
mostre seu novo salário, com 15% de aumento
"""

aumento = .15

sal = float(input("Informe o salário do funcionário: "))

sal_aumento = (aumento * sal) + sal

print(f"O salário informado com {aumento * 100 :.0f}% de aumento corresponde a {sal_aumento :.2f} R$")
