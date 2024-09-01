"""
Crie um programa que leia o nome e o preço de vários produtos. O programa deverá perguntar se
o usuário vai continuar. No final, mostre:
    
Qual é o total gasto na compra.
Quantos produtos custam mais de R$1000.
Qual é o nome do produto mais barato.
"""

gasto_total = custa_mais_mil = mais_barato = 0
primeiro_loop = True

while True:
    nome_produto = str(input("Informe o nome do produto: "))
    preco_produto = float(input("Informe o preço do produto: R$"))
    
    # Qual é o total gasto na compra
    gasto_total += preco_produto
    
    # Quantos produtos custam mais de R$1000
    if preco_produto > 1000: custa_mais_mil += 1
    
    # Qual é o nome do produto mais barato
    if primeiro_loop == True:
        mais_barato = preco_produto
        nome_barato = nome_produto
    elif preco_produto < mais_barato:
        mais_barato = preco_produto
        nome_barato = nome_produto
    
    primeiro_loop = False
    
    print()
    while True:
        opc = str(input("Deseja informar mais produtos? [S/N] ")).upper()
        if opc in 'SN': break
    if opc == 'N': break
    print("\n------------------------------------------------------------\n")

print()
print(f"Total gasto na compra: {gasto_total:.2f}")
if custa_mais_mil > 0: print(f"Quantos produtos custam mais de R$1000: {custa_mais_mil}")
print(f"Nome do produto mais barato: {nome_barato}")

input("\nPrograma encerrado...")
