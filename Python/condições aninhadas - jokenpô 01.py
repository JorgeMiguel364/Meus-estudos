from random import randint

"""
Crie um programa que faça o computador jogar Jokenpô com você
"""

print("- Jokenpô -")
print("Escolha uma das opções:")
print("0 - Pedra")
print("1 - Papel")
print("2 - Tesoura")

opc = int(input())

opc_cpu = randint(0, 2)

# Apresenta quais opções o jogador e a cpu escolheram
print("\nVocê escolheu: ", end="")

if opc == 0:
    print("Pedra")
elif opc == 1:
    print("Papel")
elif opc == 2:
    print("Tesoura")
    
print("A CPU escolheu: ", end="")

if opc_cpu == 0:
    print("Pedra")
elif opc_cpu == 1:
    print("Papel")
elif opc_cpu == 2:
    print("Tesoura")
    
print()

# Resultado da partida
if opc == opc_cpu:
    print("EMPATE!")
elif opc == 0 and opc_cpu == 1:
    print("VITÓRIA DA CPU!")
    print("Papel embrulha pedra!")
elif opc == 0 and opc_cpu == 2:
    print("VOCÊ VENCEU!")
    print("Pedra quebra tesoura!")
elif opc == 1 and opc_cpu == 0:
    print("VITÓRIA DA CPU!")
    print("Papel embrulha pedra!")
elif opc == 1 and opc_cpu == 2:
    print("VITÓRIA DA CPU!")
    print("Tesoura corta papel!")
elif opc == 2 and opc_cpu == 0:
    print("VITÓRIA DA CPU!")
    print("Pedra quebra tesoura!")
elif opc == 2 and opc_cpu == 1:
    print("VOCÊ VENCEU!")
    print("Tesoura corta papel!")
