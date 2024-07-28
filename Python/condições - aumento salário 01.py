"""
Escreva um programa que pergunte o salário de um funcionário e calcule o valor
do seu aumento.
Para salários superiores a R$1250,00, calcule um aumento de 10%.
Para salários inferiores ou iguais, o aumento é de 15%.
"""

salario = float(input("Informe o salário do funcionário: "))
print()

if salario <= 1250:
    salario += (15/100) * salario
else:
    salario += (10/100) * salario

print(f"O salário com o dado reajuste é igual a: {salario :.2f} R$")
