"""
Crie uma tupla preenchida com os 20 primeiros colocados da Tabela do Campeonato Brasileiro de
Futebol, na ordem de colocação. Depois mostre:
    
Os 5 primeiros
Os últimos 4 colocados
Times em ordem alfabética
Em que posição está o time da Chapecoense
"""

colocados = ("Botafogo", "Fortaleza", "Palmeiras", "Flamengo", "Cruzeiro", "São Paulo",
             "Bahia", "Vasco", "Atlético-MG", "Internacional", "Bragantino", "Athletico-PR",
             "Chapecoense", "Criciúma", "Grêmio", "Fluminense", "Corinthians", "Vitória",
             "Cuiabá", "Atlético-GO")

print("A lista dos 20 colocados são:")
print(colocados)

# -----------------------------------------------------------------------------------------------

print("\nOs 5 primeiros colocados são:")
print(colocados[0:5])
"""
for c in range(0, 5):
    print(f"{colocados[c]}, ", end="")
"""

# -----------------------------------------------------------------------------------------------

print("\n\nOs 4 últimos colocados são:")
print(colocados[-4:])
"""
for c in range(len(colocados) - 1, len(colocados) - 5, -1):
    print(f"{colocados[c]}, ", end="")
"""

# -----------------------------------------------------------------------------------------------

print("\n\nOs times em ordem alfabética são:")
print(sorted(colocados))

# -----------------------------------------------------------------------------------------------

print(f'\nO time da Chapecoense está na posição {colocados.index("Chapecoense")}')
