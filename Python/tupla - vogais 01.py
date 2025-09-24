"""
Crie um programa que tenha uma tupla com várias palavras (não usar acentos). Depois disso, você
deve mostrar, para cada palavra, quais são as suas vogais
"""

palavras = ("Cadeira", "Prato", "Bola", "Chinelo", "Computador", "Beterraba", "Muda"
            "Televisor", "Casa", "Prendedor", "Vinagre", "Felino", "Setembro")

for i in range(0, len(palavras)):
    print(f"{palavras[i]}: ", end='')
    
    if "a" in palavras[i]:
        print("a")
        
