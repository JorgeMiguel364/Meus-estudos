"""
Crie um programa que leia duas notas de um aluno e calcule sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
Média abaixo de 5.0: reprovado
Média entre 5.0 e 6.9: recuperação
Média 7.0 ou superior: aprovado
"""

nota1 = float(input("Informe a primeira nota: "))
nota2 = float(input("Informe a segunda nota: "))
media = (nota1 + nota2) / 2
print()

if media < 5:
    print(f"Nota: {media :.1f}")
    print("REPROVADO!")
elif media >= 5 and media <= 6.9:
    print(f"Nota: {media :.1f}")
    print("EM RECUPERAÇÃO!")
elif media >= 7:
    print(f"Nota: {media :.1f}")
    print("APROVADO!")
