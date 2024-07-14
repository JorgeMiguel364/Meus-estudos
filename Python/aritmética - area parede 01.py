"""
Faça um programa que leia a largura e a altura de uma parede em metros, calcule a
sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada
litro de tinta, pinta uma área de 2m²
"""

largura = float(input("Informe a largura da parede: "))
altura = float(input("Informe a altura da parede: "))

area = largura * altura

print("É necessário {:.2f} litro(s) de tinta para pintar a parede." .format(area / 2))