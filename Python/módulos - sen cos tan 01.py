import math

"""
Faça um programa que leia um ângulo qualquer e mostre na tela o valor
do seno, cosseno e tangente desse ângulo
"""

valor = float(input("Informe um ângulo: "))

sen = math.sin(math.radians(valor))
cos = math.cos(math.radians(valor))
tan = math.tan(math.radians(valor))

print(f"\nO seno é igual a {sen :.2f}")
print(f"O cosseno é igual a {cos :.2f}")
print(f"A tangente é igual a {tan :.2f}")
