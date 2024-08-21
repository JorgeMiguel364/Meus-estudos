from sys import exit

"""
Crie um programa que leia dois valores e mostre um menu como ao abaixo na tela.
Seu programa deverá realizar a operação solicitada em cada caso.

[1] somar
[2] multiplicar
[3] maior
[4] novos números
[5] sair do programa
"""

valor1 = int(input("Informe o primeiro valor: "))
valor2 = int(input("Informe o segundo valor: "))
print()

print("""[1] - Somar
[2] - Multiplicar
[3] - Maior
[4] - Novos números
[5] - Sair do programa\n""")

validar_entrada = True

while validar_entrada:
    opc = int(input("Escolha a opção: "))
    
    if opc >= 1 and opc <= 5:
        validar_entrada = False

print()
if opc == 1:
    print(f"A soma dos dois valores é: {valor1 + valor2}")
elif opc == 2:
    print(f"A multiplicação dos dois valores é: {valor1 * valor2}")
elif opc == 3:
    if valor1 > valor2:
        print(f"O maior valor informado foi: {valor1}")
    elif valor2 > valor1:
        print(f"O maior valor informado foi: {valor2}")
    else:
        print("Os dois valores são iguais.")
elif opc == 4:
    print("Informe os novos valores.\n")
    valor1 = int(input("Informe o primeiro valor: "))
    valor2 = int(input("Informe o segundo valor: "))
elif opc == 5:
    exit()
