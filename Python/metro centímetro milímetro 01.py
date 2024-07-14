"""
Escreva um programa que leia um valor em metros e o
exiba convertido em centímetros e milímetros
"""

metro = float(input("Informe um valor em metros: "))

print("Seu valor em centímetros corresponde a: {:.0f} cm" .format(metro * 100))
print("Seu valor em milímetros corresponde a: {:.0f} mm" .format(metro * 1000))
