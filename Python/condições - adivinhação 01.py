from random import randint

"""
Escreva um programa que faça o computador "pensar" em um número inteiro entre 0 e 5
e peça para o usuário tentar descobrir qual foi o número escolhido pelo computador.

O programa deverá escrever na tela se o usuário venceu ou perdeu.
"""

vsorteado = randint(0, 5)

vusuário = int(input("Informe um valor de 0 a 5: "))
print()

if(vusuário == vsorteado):
    print(f"Acertou! O valor sorteado foi {vsorteado}!")
else:
    print(f"Errou! O valor sorteado foi {vsorteado}!")
