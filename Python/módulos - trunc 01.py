import math

"""
Crie um programa que leia um número real qualquer pelo teclado
e mostre na tela a sua porção inteira
"""

valor_real = float(input("Informe um valor real: "))
valor_int = math.trunc(valor_real)

print(f"{valor_int}")
