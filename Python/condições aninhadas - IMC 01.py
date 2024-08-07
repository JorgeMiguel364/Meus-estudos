from math import pow

"""
Desenvolva uma lógica que leia o peso e a altura de uma pessoa,
calcule seu IMC e mostre seu status, de acordo com a tabela abaixo:
    
Abaixo de 18,5: abaixo do peso
Entre 18,5 e 25: peso ideal
25 até 30: sobrepeso
30 até 40: obesidade
Acima de 40: obesidade mórbida
"""

altura = float(input("Informe a altura (m): "))
peso = float(input("Informe o peso (kg): "))
print()

imc = peso / pow(altura, 2)
print(f"Seu peso é {imc :.2f}.")

if imc < 18.5:
    print("Está abaixo do peso!")
elif imc >= 18.5 and imc < 25:
    print("Está com o peso ideal!")
elif imc >= 25 and imc < 30:
    print("Está com sobrepeso!")
elif imc >= 30 and imc < 40:
    print("Está com obesidade!")
elif imc >= 40:
    print("Está com obesidade mórbida!")
    
