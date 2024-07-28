"""
Desenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o preço da
passagem, cobrando R$0,50 por Km para viagens de até 200Km e R$0,45 para viagens mais
longas
"""

viagem_km = float(input("Informe a distância em Km: "))

if viagem_km < 200:
    preço_passagem = .50 * viagem_km
    print(f"O preço da viagem custando 50 centavos por km é R${preço_passagem :.2f}")
else:
    preço_passagem = .45 * viagem_km
    print(f"O preço da viagem custando 45 centavos por km é R${preço_passagem :.2f}")
    

