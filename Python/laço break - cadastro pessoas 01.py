"""
Crie um programa que leia a idade e o sexo de várias pessoas. A cada pessoa cadastrada, o programa
deverá perguntar se o usuário quer ou não continuar. No final, mostre:
    
Quantas pessoas tem mais de 18 anos
Quantos homens foram cadastrados
Quantas mulheres tem menos de 20 anos
"""

maioridade = h_cadastrados = m_menor = 0

while True:
    idade = int(input("Informe a idade da pessoa: "))
    print()
    
    while True:
        genero = str(input("Informe o gênero da pessoa [H/M] ")).upper()
        if genero in "HM": break
    
    # Quantas pessoas tem mais de 18 anos
    if idade >= 18:
        maioridade += 1
        
    # Quantos homens foram cadastrados
    if genero == 'H':
        h_cadastrados += 1
    
    # Quantas mulheres tem menos de 20 anos
    if genero == 'M' and idade < 20:
        m_menor += 1
    
    print()
    while True:
        opc = str(input("Deseja continuar? [S/N] ")).upper()
        if opc in "SN": break
    
    if opc == 'N': break
    print("\n---------------------------------------------------------------\n")
    
print()
if maioridade > 0: print(f"Quantidade de pessoas com mais de 18 anos: {maioridade}")
if h_cadastrados > 0: print(f"Quantos homens foram cadastrados: {h_cadastrados}")
if m_menor > 0: print(f"Quantas mulheres tem menos de 20 anos: {m_menor}")

input("\nPrograma encerrado...")
