"""
Crie um programa que leia uma frase qualquer e diga se ela é um políndromo,
desconsiderando os espaços
"""

frase1_inverso = ""
frase1 = str(input("Entre com uma frase: ")).upper()

frase1_palavras = frase1.split()
frase1_junto = "".join(frase1_palavras)

for l in range(len(frase1_junto) - 1, -1, -1):
    frase1_inverso += frase1_junto[l]

print(f"\n{frase1_junto}\n{frase1_inverso}\n")

if frase1_junto == frase1_inverso:
    print("É um POLÍNDROMO!")
else:
    print("Não é um POLÍNDROMO!")
