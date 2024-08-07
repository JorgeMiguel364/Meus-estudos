"""
Escreva um programa que leia um número inteiro qualquer e peça para o usuário
escolher qual será a base de conversão:
1 para binário
2 para octal
3 para hexadecimal
"""

num_int = int(input("Informe um número inteiro: "))

print("""\nEscolha para qual base deseja converter o número:
1 - binário
2 - octal
3 - hexadecimal""")

opc = int(input(": "))

if opc == 1:
    print(f"O número {num_int} convertido para binário é: {bin(num_int)[2:]}")
elif opc == 2:
    print(f"O número {num_int} convertido para octal é: {oct(num_int)[2:]}")
elif opc == 3:
    print(f"O número {num_int} convertido para hexadecimal é: {hex(num_int)[2:]}")
else:
    print("Opção inválida!")
