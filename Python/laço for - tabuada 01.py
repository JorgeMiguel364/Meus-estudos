"""
Refaça o exercício da tabuada, mostrando a tabuada de um número que o usuário
escolher, só que agora utilizando um laço for
"""

valor = int(input("Informe um valor: "))
print()

for c in range(0, 11):
    print(f"{valor} * {c:2} = {valor * c}")
