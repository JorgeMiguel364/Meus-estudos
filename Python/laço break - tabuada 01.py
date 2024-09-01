"""
Faça um programa que mostre a tabuada de vários números, um de cada vez, para cada valor digitado
pelo usuário. O programa será interrompido quando o número solicitado for negativo.
"""

numero = 0

while True:
    numero = int(input("Informe um valor: "))
    print()
    
    if numero < 0:
        break
    
    for i in range(0, 11):
        print(f"{numero} * {i:2} = {numero * i}")
        
    print()
