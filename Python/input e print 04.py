# Faça um programa que leia algo pelo teclado e mostre
# na tela o seu tipo primitivo e todas as informações possíveis sobre ele

valor = input("Informe um valor: ");

print(type(valor))

print("\nÉ alfanumérico?\n{}" .format(valor.isnumeric()))
print("\nÉ alfabético?\n{}" .format(valor.isalpha()))
print("\nÉ decimal?\n{}" .format(valor.isdecimal()))
print("\nÉ um dígito?\n{}" .format(valor.isdigit()))
print("\nÉ minúsculo?\n{}" .format(valor.islower()))
print("\nÉ numérico?\n{}" .format(valor.isnumeric()))
print("\nÉ maiúsculo?\n{}" .format(valor.isupper()))
