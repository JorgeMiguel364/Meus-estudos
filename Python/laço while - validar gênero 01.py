"""
Faça um programa que leia o sexo de uma pessoa, mas só aceite os valores 'M' ou 'F'.
Caso esteja errado, peça a digitação novamente até ter um valor correto.
"""

genero = str(input("Informe o gênero da pessoa [M/F] ")).upper()
while genero != 'M' and genero != 'F':
    genero = str(input("\nEntrada inválida.\nInforme o gênero da pessoa [M/F] ")).upper()


if genero == 'M':
    print("É homem!")
elif genero == 'F':
    print("É mulher!")
