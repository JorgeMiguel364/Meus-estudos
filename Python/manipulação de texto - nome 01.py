"""
Crie um programa que leia o nome completo de uma pessoa e mostre:
    
O nome com todas as letras maiúsculas
O nome com todas as letras minúsculas
Quantas letras ao todo (sem considerar espaços)
Quantas letras tem o primeiro nome

"""

nome = str(input("Informe seu nome completo: "))

print("")
print(nome.upper())
print(nome.lower())
print(len("".join(nome.split())))
print(len(nome.split()[0]))
