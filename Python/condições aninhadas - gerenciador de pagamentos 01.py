"""
Elabore um programa que calcule o valor a ser pago por um produto,
considerando o seu preço normal e condição de pagamento:

À vista dinheiro/cheque: 10% de desconto
À vista no cartão: 5% de desconto
Em até 2x no cartão: preço normal
3x ou mais no cartão: 20% de juros
"""

preço = float(input("Informe o preço a ser pago: "))

print("\nEscolha a forma de pagamento:")
print("1 - À vista.\n2 - Parcelado.")
opção = int(input())

if opção == 1:
    
    print("\nÀ VISTA - ", end="")
    print("Escolha uma das duas opções:")
    print("1 - Dinheiro/cheque.\n2 - Cartão.")
    opção = int(input())
    
    if opção == 1:
        print(f"\nPreço informado: {preço :.2f} R$.")
        print(f"O preço a se pagar com 10% de desconto é: {preço - (.10 * preço) :.2f} R$.")
    elif opção == 2:
        print(f"\nPreço informado: {preço :.2f} R$.")
        print(f"O preço a se pagar com 5% de desconto é: {preço - (.05 * preço) :.2f} R$.")
    else:
        print("\nOpção inválida!")
    
elif opção == 2:
    
    print("\nPARCELADO - ", end="")
    print("Informe em quantas vezes serão feitas as parcelas no cartão:")
    parcelas = int(input())
    
    if parcelas < 3:
        print(f"\nO valor a ser pago será: {preço :.2f} R$.")
    elif parcelas >= 3:
        print(f"\nPreço informado: {preço :.2f} R$.")
        print(f"O preço a se pagar com 20% de juros é: {preço + (.20 * preço) :.2f} R$.")
        
else:
    print("\nOpção inválida!")
