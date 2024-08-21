from random import randint

"""
Melhore o jogo da adivinhação onde o computador vai "pensar" em um número entre 0 e 10. Só que
agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram
necessários para vencer.
"""

tentativas = 0
val_min = 0
val_max = 10

val_sorteado = randint(val_min, val_max)

val_usuario = int(input("Informe um valor: "))

while val_usuario != val_sorteado:
    tentativas += 1
    val_usuario = int(input("\nErrou!\nInforme novamente um valor: "))

print(f"\nAcertou!\nO valor correto é: {val_usuario}")

if tentativas > 0:
    print(f"Tentativas: {tentativas}")
