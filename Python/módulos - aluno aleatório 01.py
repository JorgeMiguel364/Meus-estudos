from random import choice

"""
Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça
um programa que ajude ele, lendo o nome deles e escrevendo o nome do escolhido
"""

"""
al1 = str(input("Informe o primeiro aluno: "))
al2 = str(input("Informe o segundo aluno: "))
al3 = str(input("Informe o terceiro aluno: "))
al4 = str(input("Informe o quarto aluno: "))
"""

al1 = "Renan"
al2 = "Ulisses"
al3 = "José"
al4 = "Pablo"

lista_alunos = [al1, al2, al3, al4]

print(f"\nO aluno escolhido foi: {choice(lista_alunos)}")
