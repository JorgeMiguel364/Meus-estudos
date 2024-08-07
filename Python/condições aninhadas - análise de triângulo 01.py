"""
Refaça o exercício "condições - análise de triângulo 01", acrescentando o recurso de mostrar
que tipo de triângulo será formado:
Equilátero: todos os lados iguais
Isósceles: dois lados iguais
Escaleno: todos os lados diferentes
"""

reta1 = float(input("Informe a primeira reta em comprimentos: "))
reta2 = float(input("Informe a segunda reta em comprimentos: "))
reta3 = float(input("Informe a terceira reta em comprimentos: "))
print()

if reta3 + reta2 > reta1 and reta1 + reta3 > reta2 and reta1 + reta2 > reta3:
    print("É possível formar um triângulo com os dados fornecidos!")
    
    if reta1 == reta2 == reta3:
        print("É UM EQUILÁTERO!")
    elif reta1 != reta2 != reta3 != reta1:
        print("É UM ISÓSCELES!")
    else:
        print("É UM ESCALENO!")
else:
    print("Não é possível formar um triângulo com os dados fornecidos!")
