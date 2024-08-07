import datetime

"""
Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo
com sua idade, se ele ainda vai se alistar ao serviço militar, se é hora de se alistar
ou se já passou do tempo de alistamento.
Seu programa também deverá mostrar o tempo que falta ou que passou do prazo
"""

ano_nascimento = int(input("Informe o ano de nascimento: "))
idade = datetime.datetime.now().year - ano_nascimento

print()

if idade > 18:
    print(f"Quem nasceu em {ano_nascimento} tem {idade} anos hoje.")
    print(f"Seu alistamento foi há {idade - 18} anos ({datetime.datetime.now().year - (idade - 18)}).")
elif idade < 18:
    print(f"Quem nasceu em {ano_nascimento} tem {idade} anos hoje.")
    print(f"Seu alistamento será daqui a {18 - idade} anos ({datetime.datetime.now().year + (18 - idade)}).")
elif idade == 18:
    print(f"Quem nasceu em {ano_nascimento} tem {idade} anos hoje.")
    print("Seu alistamento deve ser realizado imediatamente!")
