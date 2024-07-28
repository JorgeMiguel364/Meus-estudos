"""
Faça um programa que leia três números e mostre qual
é o maior e qual é o menor.
"""

primeiro = int(input("Informe o primeiro número: "))
segundo = int(input("Informe o segundo número: "))
terceiro = int(input("Informe o terceiro número: "))

# Teste do menor valor
if primeiro <= segundo and primeiro <= terceiro:
    menor = primeiro
if segundo <= primeiro and segundo <= terceiro:
    menor = segundo
if terceiro <= primeiro and terceiro <= segundo:
    menor = terceiro
    
# Teste do maior valor
if primeiro >= segundo and primeiro >= terceiro:
    maior = primeiro
if segundo >= primeiro and segundo >= terceiro:
    maior = segundo
if terceiro >= primeiro and primeiro >= segundo:
    maior = terceiro
    
print()
print(f"Maior valor informado: {maior}")
print(f"Menor valor informado: {menor}")

