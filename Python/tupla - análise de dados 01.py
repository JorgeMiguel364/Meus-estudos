"""
Desenvolva um programa que leia quatro valores pelo teclado e guarde-os em uma tupla.
No final, mostre:
Quantas vezes apareceu o valor 9
Em que posição foi digitado o primeiro valor 3
Quais foram os números pares
"""

val_tup = tuple(int(input("Informe um valor: ")) for i in range(4))

val9 = val_tup.count(9)
if 3 in val_tup: pos3 = val_tup.index(3)

print()
if val9 > 0:
    print(f"A quantidade de vezes em que o número 9 foi informado é: {val9}")
else:
    print("O valor 9 não foi informado.")
    
if 3 in val_tup:
    print(f"A posição em que o número 3 se encontra é: {pos3}")
else:
    print("O valor 3 não foi informado.")

print("Os valores pares informados foram: ", end="")
for i in range(len(val_tup)):
    if val_tup[i] % 2 == 0:
        print(f"{val_tup[i]}, ", end="")
