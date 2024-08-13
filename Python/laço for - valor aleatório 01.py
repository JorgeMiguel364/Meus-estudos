from random import randint

existem_valores_pares = False
valores_pares = 0

for i in range(0, 10):
    valor_aleatorio = randint(0, 100)        
        
    if valor_aleatorio % 2 == 0:
        print(f"{valor_aleatorio}, ", end="")
        existem_valores_pares = True
        valores_pares += 1
    
print()
if existem_valores_pares == True:
    print(f"Quantidade de valores pares gerados pela CPU: {valores_pares}")
else:
    print("Não foram gerados valores pares!")
