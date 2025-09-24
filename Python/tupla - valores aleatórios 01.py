from random import randint

"""
Crie um programa que vai gerar cinco números aleatórios e colocar em uma tupla. Depois disso, mostre
a listagem de números gerados e também indique o menor e o maior valor que estão na tupla
"""

val = tuple(randint(0, 100) for i in range(5))

print(f"Os valores aleatórios gerados foram:\n{val}")
print(f"O maior valor presente na tupla é: {max(val)}")
print(f"O menor valor presente na tupla é: {min(val)}")

