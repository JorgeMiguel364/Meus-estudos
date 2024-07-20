from random import sample

"""
O mesmo professor do desafio anterior quer sortear a ordem de apresentação de trabalhos
dos alunos. Faça um programa que leia o nome dos quatro alunos e mostre a ordem sorteada
"""

aluno1 = "José Vieira"
aluno2 = "Ancelmo Barros"
aluno3 = "Henrique Casapequena"
aluno4 = "Ulisses Arruda"

print(f"\nA sequência dos alunos são:\n{sample([aluno1, aluno2, aluno3, aluno4], k=4)}")
