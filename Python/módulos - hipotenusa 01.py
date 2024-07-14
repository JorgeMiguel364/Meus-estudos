from math import hypot

"""
Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente
de um triângulo retângulo, calcule e mostre o comprimento da hipotenusa
"""

cat_oposto = float(input("Informe o comprimento do cateto oposto: "))
cat_adjacente = float(input("Informe o comprimento do cateto adjacente: "))

hipotenusa = hypot(cat_oposto, cat_adjacente)

print(f"A hipotenusa do triângulo retângulo é igual a {hipotenusa :.2f}")
