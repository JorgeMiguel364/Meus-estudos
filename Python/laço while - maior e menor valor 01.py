"""
Crie um programa que leia vários números inteiros pelo teclado. No final da execução, mostre a
média entre todos os valores e qual foi o maior e o menor valores lido. O programa deve perguntar
ao usuário se ele quer ou não continuar a digitar valores.
"""

continuar = True
valor = media = contador = maior = menor = 0
opc = ''

while continuar:
    valor = int(input("Informe um valor: "))
    
    if contador == 0:
        maior = valor
        menor = valor
    elif valor > maior:
        maior = valor
    elif valor < menor:
        menor = valor
        
    media += valor
    contador += 1
    
    opc = str(input("\nDeseja digitar mais valores? [S/N] ")).upper()
    
    if opc == 'N':
        continuar = False
    else:
        print()
        
media /= contador
print(f"\nA média entre os valores informados é: {media:.1f}")
print(f"O maior valor lido foi: {maior}")
print(f"O menor valor lido foi: {menor}")

input("\nPressione qualquer tecla...")
