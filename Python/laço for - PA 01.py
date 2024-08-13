"""
Desenvolva um programa que leia o primeiro termo e a razão de uma PA.
No final, mostre os 10 primeiros termos dessa progressão
"""

termo = int(input("Informe o primeiro termo: "))
razao = int(input("Informe a razão: "))

print("\nOs 10 primeiros termos dessa progressão é:")
print(f"{termo}, ", end="")

for i in range(0, 10):
    termo += razao
    print(f"{termo}, ", end="")
