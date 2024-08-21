"""
Escreva um programa que leia um número qualquer e mostre o seu fatorial
"""

numero = int(input("Informe um valor: "))
contador = numero
fatorial = 1

print(f"{numero}! = ", end="")
while contador > 0:
    
    print(f"{contador}", end="")
    print(" * " if contador > 1 else ' = ', end="")
    
    fatorial *= contador
    contador -= 1
    
print(fatorial)
