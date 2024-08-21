valor = int(input("Informe um valor: "))
contador = valor
fatorial = 1

while contador > 0:
    fatorial *= contador
    contador -= 1
    
print(f"O fatorial de {valor}! é: {fatorial}")
