"""
Escreva um programa que leia a velocidade de um carro.
Se ele ultrapassar 80Km/h, mostre uma mensagem dizendo que ele foi multado.
A multa vai custar R$7,00 por cada Km acima do limite.
"""

velocidade = float(input("Informe a velocidade do carro: "))

print()
if velocidade <= 80:
    print("Está abaixo de 80Km/h!")
else:
    multa = (velocidade - 80) * 7
    print("Está acima de 80Km/h!")
    print(f"Você foi multado em R${multa :.2f}!")
