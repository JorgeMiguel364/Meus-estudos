from random import randint

"""
Faça um programa que jogue par ou ímpar com o computador. O jogo só será interrompido quando o
jogador perder, mostrando o total de vitórias consecutivas que ele consquistou no final do jogo
"""

vitorias = 0

while True:
    
    while True:
        paridade = int(input("Escolha uma das opções (1 - par, 2 - ímpar) "))
        if paridade == 1 or paridade == 2: break
    
    while True:
        valor = int(input("Informe um valor de 0 a 5: "))
        if valor >= 0 and valor <= 5: break
        
    valor_cpu = randint(0, 5)
    
    par_ou_impar = (valor + valor_cpu) % 2
    
    print("\nParidade do jogador: ", end='')
    print("par") if paridade == 1 else print("ímpar")
    print(f"Valor do jogador: {valor}")
    print(f"Valor da CPU: {valor_cpu}")
    print(f"Soma: {valor + valor_cpu} ", end='')
    
    print("(par)\n") if par_ou_impar == 0 else print("(ímpar)\n")
    
    if (paridade == 1 and par_ou_impar == 0) or (paridade == 2 and par_ou_impar != 0):
        print("Você venceu!")
        print("\n-----------------------------------------------------\n")
        vitorias += 1
    else:
        print("Você perdeu!")
        print("\n-----------------------------------------------------\n")
        break
    
print(f"Vitórias consecutivas: {vitorias}") if vitorias != 0 else print("Nenhuma vitória")
