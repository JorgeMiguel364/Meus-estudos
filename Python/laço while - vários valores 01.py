"""
Crie um programa que leia vários números inteiros pelo teclado. O programa só vai parar quando
o usuário digitar o valor 999, que é a condição de parada. No final, mostre quantos números
foram digitados e qual foi a soma entre eles (desconsiderando o flag).
"""

numero = contadorNumeros = somaNumeros = 0

numero = int(input("Informe um valor de 0 a 998: "))
while numero < 999:
    somaNumeros += numero
    contadorNumeros += 1
    numero = int(input("Informe um valor de 0 a 998: "))
    
print(f"\nA soma dos valores informados é: {somaNumeros}")
print(f"A quantidade de valores informados foi: {contadorNumeros}")
