"""
Refaça o exercício de PA, lendo o primeiro termo e a razão de uma PA, mostrando
os 10 primeiros termos da progressão usando a estrutura while.
"""

contador = 0

termo = int(input("Informe o primeiro termo: "))
razao = int(input("Informe sua razão: "))

print("\nOs 10 primeiros termos da PA é:")
print(f"{termo}, ", end="")

while contador < 10:
    termo += razao
    print(f"{termo}, ", end="")
    contador += 1
