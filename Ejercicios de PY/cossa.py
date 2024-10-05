

# Calcular el factorial de un número usando un bucle while con una variable como contador
numero = int(input("introduce un numero: "))
resultado = 1
contador = 1

while contador <= numero:
    resultado =resultado * contador
    contador = contador + 1

print(f"El factorial de {numero} es {resultado}")











