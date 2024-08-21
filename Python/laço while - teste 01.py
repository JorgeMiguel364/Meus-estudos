"""
Enquanto não digitar 0, peça para o usuário informar um valor
e some os valores informados e apresente-os na tela
"""

valor = 1
soma_valor = 0

while valor != 0:
    valor = int(input("Informe um valor: "))
    soma_valor += valor
    
    print(soma_valor)
    print()

print("Programa finalizado!")
