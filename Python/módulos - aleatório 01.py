import random

"""
Escreva um programa que gere um valor aleatório, e realize operações
aritméticas com um outro valor fornecido pelo usuário
"""

aleat = random.randint(1, 99)

valor = int(input("Informe um valor: "))
print(f"Valor aleatório: {aleat}\n")

print(f"{aleat} * {valor} = {aleat * valor}")
print(f"{aleat} / {valor} = {aleat / valor :.2f}")
print(f"{aleat} + {valor} = {aleat + valor}")
print(f"{aleat} - {valor} = {aleat - valor}")
