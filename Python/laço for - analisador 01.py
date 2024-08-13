"""
Desenvolva um programa que leia o nome, idade e o sexo de 4 pessoas.
No final do programa, mostre:
A média de idade do grupo
Qual é o nome do homem mais velho
Quantas mulheres têm menos de 20 anos
"""

idade_geral = 0
primeira_vez = True
mulheres_menores = 0

for i in range(0, 4):
    print(f"Pessoa {i + 1}:")
    genero = str(input("Informe o gênero da pessoa (H/M): ")).upper()
    nome = str(input("Informe seu nome: "))
    idade = int(input("Informe sua idade: "))
    
    idade_geral += idade
        
    if genero == 'H':
        if primeira_vez == True:
            maior_idade = idade
            velho_nome = nome
            primeira_vez = False
        elif maior_idade < idade:
            maior_idade = idade
            velho_nome = nome
    if genero == 'M':
        if idade < 20:
            mulheres_menores += 1
            
    print()

print(f"A média de idade do grupo é: {idade_geral / 4 :.0f} anos")
print(f"O homem mais velho tem {maior_idade} anos e se chama: {velho_nome}")

if mulheres_menores != 0:
    print(f"Quantidade de mulheres menores que 20 anos: {mulheres_menores}")
