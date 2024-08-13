"""
Crie um programa que mostre na tela todos os números pares
que estão no intervalo entre 1 e 50.
"""

print("Os números pares entre 0 e 50 são:")

for val in range(0, 51):
    if val % 2 == 0:
        print(f"{val}, ", end="")
