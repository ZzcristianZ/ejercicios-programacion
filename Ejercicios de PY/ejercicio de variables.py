#ejercicios 1
print("hola mundo")


# ejercicio 2

mi_texto = "hola mundo"
print(type(mi_texto))

# ejercicio 3

z=int(5*2/1.5)
print(z)

# ejercicio 4

z = int(input("ingrese su edad: "))
print(type(z))


# ejercicio 5

z= float(input("ingrese su inverción:"))
print("su tasa de interes es del 2 % por año")
c = int(input("ingrese años del prestamo: "))
print("sus intereses son de ",(z*(1+2/100)**c)-z)

# ejercicio 6

intencidad = float(input("ingrese valor de intensidad: "))
resistencia = float(input("ingrese valor de resistencia: "))
print(intencidad * resistencia )

# ejercicio 7
v= float(input("de el valor del radio: "))
m= 2* 3.14 * v
print("la circunferencia del circulo es de: ",m)
o=2*v
print("y su diametro es de: ",o)

# ejercicio 8

p1= float(input("ingrese el peso del atomo 1"))
a1= int(input("ingrese el numero de atomos: "))
p2= float(input("ingrese el peso del atomo 2"))
a2= int(input("ingrese el numero de atomos: "))


pm= p1*a1+p2*a2
print("el peso atomico de los atomos es de: ",pm)

