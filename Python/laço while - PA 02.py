"""
Melhore o exercício de PA, perguntando para o usuário se ele quer mostrar mais alguns
termos. O programa encerra quando ele disser que quer mostrar 0 termos.
"""

opcao = ''

while True:

    contador = 0
    
    termo = int(input("Informe o primeiro termo: "))
    razao = int(input("Informe a razão: "))
    
    print("\nOs 10 termos da PA são:")
    
    while contador < 10:
        termo += razao
        print(f"{termo}, ", end="")
        contador += 1
        
    print("\n")
    
    while True:
        opcao = str(input("Deseja calcular mais algum termo? [S/N] ")).upper()
        if opcao == 'S' or opcao == 'N':
            break
        
    if opcao == 'N':
        break
        
    print()
    
print("\nEncerrando...")
