"""
Crie um programa que tenha uma tupla única com nomes de produtos e seus respectivos preços,
na sequência. No final, mostre uma listagem de preços, organizando os dados em forma tabular
"""

listagem = ("Bolacha", 2.90, "Leite", 4.95, "Cerveja", 2.89, "Tempero", 2.70, "Óleo", 8.95,
            "Molho", 3.70, "Macarrão", 6.70, "Arroz", 17.80, "Feijão", 4.75, "Cachaça", 12,
            "Mostarda", 3.99, "Maionese", 4, "Maçã", 4.99, "Carne", 14.9, "Presunto", 6)

print("- Lista de preços -")
print()

for i in range(0, len(listagem), 2):
    print(f"{listagem[i]:.<40}", f" R$ {listagem[i+1]:>7.2f}")
