from datetime import date

"""
A confederação nacional de natação precisa de um programa que leia o ano de nascimento de um
atleta e mostre sua categoria, de acordo com a idade:
Até 9 anos: mirim
Até 14 anos: infantil
Até 19 anos: júnior
Até 25 anos: sênior
Acima: master
"""

ano_nasc = int(input("Informe o ano de nascimento: "))
idade_atleta = date.today().year - ano_nasc

print(f"\nO atleta possui {idade_atleta} anos e sua categoria é:")

if idade_atleta <= 9:
    print("MIRIM")
elif idade_atleta > 9 and idade_atleta <= 14:
    print("INFANTIL")
elif idade_atleta > 14 and idade_atleta <= 19:
    print("JÚNIOR")
elif idade_atleta > 19 and idade_atleta <= 25:
    print("SÊNIOR")
elif idade_atleta > 25:
    print("MASTER")
