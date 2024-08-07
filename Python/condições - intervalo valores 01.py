limite1 = int(input("Informe o limite inicial: "))
limite2 = int(input("Informe o limite final: "))
limite3 = int(input("Informe um valor: "))

print()
if limite3 >= limite1 and limite3 <= limite2:
    print("O valor informado está dentro dos limites definidos!")
else:
    print("O valor informado não está dentro dos limites definidos!")
