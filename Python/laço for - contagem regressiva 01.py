from time import sleep

"""
Faça um programa que mostre na tela uma contagem regressiva para o estouro
de fogos de artifício, indo de 10 até 0, com uma pausa de 1 segundo entre eles.
"""

for i in range(10, 0, -1):
    print(i)
    sleep(1)
print("Que atirem os fogos!!!!")
