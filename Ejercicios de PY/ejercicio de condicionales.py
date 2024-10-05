#ejercicio numero 1

a = 50
b = 10

if a>b:
    print("Hello World")

# ejercicio 2

edad = int(input("ingrese edad: "))
if edad >= 18:
    print("mayor de edad")
else:
    print("menor de edad")

# ejercicio 3
a=float(input("ingrese cateto a: "))
b=float(input("ingrese cateto b: "))

if a>0 and b>0:
    print(a**2+b**2)
elif a<=0 or b<=0:
    print("error")
    
# ejercicio 4

a=int(input("ingrese valor: "))
b=int(input("ingrese valor: "))

print("1 entonces es suma")
print("2 entonces es multiplicacion")
print("3 entonces es resta")
print("4 entonces es devición")
cosa=int(input("ingrese valor de operacion: "))
if cosa == 1:
    print(a+b)
elif cosa ==2:
    print(a*b)
elif cosa==3:
    print(a-b)
elif cosa ==4:
    print(a/b)

# ejercicio 5
total=float(input("ingrese total de compra: "))
puntos=int(input("ingrese sus puntos: "))

if puntos<100:
    print(total-(total*0.1))
elif puntos>=100 and puntos<150:
     print(total-(total*0.2))
elif puntos==150:
    print(total-(total*0.15))
elif puntos>150:
    print(total-(total*0.2))
    
# ejercicio 6

factura= float(input("ingrese valor de la factura: "))
tipo= input("tipo de factura: ")

if tipo == "normal" or tipo =="Normal":
    print(factura-(factura*0.21))
elif tipo == "restaurante" or tipo=="Restaurante":
    print(factura-(factura*0.1))
    
# ejercicio 7

pin=input("ingrese contraseña")
if pin== "123456789":
    print("bienvenido")
else:
    print("ordenador bloqueado, contraseña incorrescta")
    
# ejercicio 8

año= int(input("ingrese año"))

if año % 4 == 0 or año % 100 ==0 or año%400 ==0:
    print("el año es viciesto")
else:
    print("el año no es biciesto")
    
# ejercicio 9

tarifa=int(input("ingrese tarifa anual: "))

edad=int(input("ingrese su edad: "))
trabaja=(input("usted trabaja?: "))

if edad >= 18 and trabaja== "si"or trabaja=="Si":
    print(tarifa)
elif edad < 18 and trabaja== "si" or trabaja=="Si":
    print(tarifa-(tarifa*0.05))
elif edad >= 18 and trabaja== "no" or trabaja=="No":
    print(tarifa-(tarifa*0.25))
elif edad < 18 and trabaja== "no"or trabaja=="No":
    print(tarifa-(tarifa*0.5))
    
# ejercicio 10

pregunta=input("quiere pizza vegetariana: ")

if pregunta == "si" or pregunta=="Si":
    print("la tenemos con: "),print("1 para pimiento"),print("2 para tofu"),print("escoja uno")
    ingredientes=int(input("ingrese su ingrediente: "))
    if ingredientes == 1:
         print("su pizza es vegetariana y tiene mozzarela, tomate y pimiento")
    else:
        print("su pizza es vegetariana y tiene mozzarela, tomate y tofu")
elif pregunta == "no" or "No":
    print("entonces tenemos pizza no vegetariana que tiene: "),print("1 para peperoni"),print("2 para jamón"),print("3 para salmón")
    ingrediente=int(input("ingrese el valor de su ingrediente"))
    if ingrediente == 1:
       print("su pizza no vegetariana y tiene mozzarela, tomate y peperoni")
    if ingrediente == 2:
        print("su pizza no vegetariana y tiene mozzarela, tomate y jamón")
    if ingrediente == 3:
         print("su pizza no vegetariana y tiene mozzarela, tomate y salmón")



# ejercicio 11

valor= float(input("ingrese su nota: "))
if valor >=4 and valor<=5:
    print("Sobresaliente")
elif valor <4 and valor >=3:
    print("Aprobado")    
elif valor <3 and valor >=0:
    print("Reprobado")


# ejercicio 12

v = int(input("ingrese nota: "))
m= float(input("ingrese el valor de la matricula: "))
if v ==9 or v==10:
    print("Sobresaliente y su matricula es de",m-(m*0.5))
elif v==7 or v== 8:
    print("Notable y su matricula es de",m-(m*0.25))
elif v == 6:
    print("Bien y su matricula es de",m-(m*0.15))
elif v==5:
    print("Suficiente y su matricula es de",m-(m*0.05))
elif v==3 or v== 4:
    print("Insuficiente y su matricula es de",m+(m*0.1))
elif v==0 or v== 1 or v==2:
    print("Muy deficiente y su matricula es de",m+(m*0.2))
        

# ejercicio 13

val=820000

print("este es la clasificación de la empresa")
print("1         empleado señior")
print("2         empleado junior")
print("3         empleado expres")
print("4         empleado prueba")
tipo=int(input("ingrese el tipo de empleado: "))
tor=int(input("ingrese cantidad de tornillos hechos: ")) 
if tipo ==1:
    print("Su pago total es de",val+tor*10)
elif tipo==2:
    print("Su pago total es de",val+tor*5)
elif tipo==3:
    print("Su pago total es de",val+tor*2)
elif tipo==4:
    print("Su pago total es de",val+tor*1)
    

# ejercicio 14

esta=float(input("ingrese su estatura: "))
if esta >1.60:
    edad=int(input("ingrese su edad: "))    
    if edad> 35 :
        xp=int(input("ingrese años de experiencia: "))
        if xp >= 8:
            print("usted ha sido admitido ya que cuenta con los requisitos para ser admitido.")
        else:
            print("usted no cuenta con los requisitos para ser admitido ")
    else:
        print("usted no cuenta con los requisitos para ser admitido ")
else:
    print("usted no cuenta con los requisitos para ser admitido ")        


# ejercicio 15

print("Este es el menú del restaurante de comidas rapidas El coresterol")
print("tenemos los siquientes combos ")
print("1                     combo americano.")
print("que trae perro, gaseosa y papitas")
print("2                     combo light")
print("que trae pizza y té")
print("3                     combo vaquis")
print("que trae hamburguesa, perro y gaseosa")
print("4                      combo peques")
print("que trae salchipapas, gaseosa y papitas")
print("5 que es un combo para armar y puede escoger entre perro, hamburguesa, gaseosa y papitas")
p=1500
ham=2000
gs=1000
papa=1000
tipc= int(input("ingrese el numero de su combo: "))
if tipc==1:
    print("su combo es el americano y tiene un valor de",3000-(3000*0.2))
elif tipc==2:
    print("su combo es el light y tiene un valor de",2000)
elif tipc==3:
    print("su combo es el vaquis y tiene un valor de",5500-(5500*0.35))
elif tipc==4:
    print("Arme su combo con los siguientes productos: Perro, Hamburguesa,Gaseosa o papitas y la cantidad de cada uno de ellos.")
    can_p=int(input("ingrese la cantidad de perros: ")) 
    can_ham=int(input("ingrese la cantidad de hamburguesa: "))
    can_gs=int(input("ingrese la cantidad de gaseosa: "))
    can_papa=int(input("ingrese la cantidad de papitas: "))
    print("su combo es a la medida y tiene un valor de",p*can_p+ham*can_ham+gs*can_gs+papa*can_papa)
   
# ejercicio 16

print("1 para superior,2 para medio y 3 para novato")
catg=int(input("ingrese el numero de su categoria: "))
drones=int(input("ingrese la cantidad de drones que fabricó: "))
if catg==1 and drones<500:   
    sueldo=1500000+drones*5000
    print("su sueldo final es de: ",sueldo,"y obtuvo una bonificacion por drones de:",drones*5000)
elif catg ==1 and drones>=500:
    sueldo=1500000+(1500000*0.15)+drones*5000
    print("su sueldo final es de: ",sueldo,"y obtuvo una bonificacion por drones de:",drones*5000)
    
elif catg==2 :   
    sueldo=1300000+drones*3500
    print("su sueldo final es de: ",sueldo,"y obtuvo una bonificacion por drones de:",drones*3500)

elif catg==3 and drones>=100:   
    sueldo=1100000+drones*1000
    print("su sueldo final es de: ",sueldo,"y obtuvo una bonificacion por drones de:",drones*1000)
elif catg ==3 and drones<100:
    sueldo=1100000+(1100000*0.1)+drones*1000
    print("su sueldo final es de: ",sueldo,"y obtuvo una bonificacion por drones de:",drones*1000)

# ejercicio 17

#a
manzana=500
pera=int(input("ingrese precio de la pera: "))
piña=int(input("ingrese precio de la piña: "))
naranja=int(input("ingrese precio de la naranja: "))
if pera>piña and pera>naranja:
    print("la fruta mas cara es la pera con, ",pera)
elif piña>pera and piña>naranja:
    print("la fruta mas cara es la piña con,", piña)   
elif naranja>pera and naranja>piña:
    print("la fruta mas cara es la narranja con, ",naranja) 
else:
    print("no se encuentra un producto mayor a todos")

#b
import math
pera=600

if 2700%600==0:
    print(" con 2700 puede comprar",math.trunc(2700/600),"peras")
    
else:
    print("con 2700 puede comprar",math.trunc(2700/600),"peras","y tendra 300 vueltos. ")

#c
Manzana =500
Pera =600
Piña =2000
Naranja =300
fruta=input("ingrese la fruta deseada: ")
can=int(input("ingrese la cantidad de frutas: "))

if fruta== "manzana" or fruta=="Manzana":
    print("el total a pagar es de, ",manzana*can)
elif fruta=="pera" or fruta=="Pera":
    print("el total a pagar es de, ",pera*can)
elif fruta=="piña" or fruta=="Piña":
    print("el total a pagar es de, ",piña*can)
elif fruta=="naranja" or fruta=="Naranja":
    print("el total a pagar es de, ",naranja*can)
else:
    print("fruta no encontrada")
    
#d
Manzana =500
Pera =600 
Piña =2000
Naranja =300
print("1 para ordenarlas de menor a mayor" )
print("2 para ordenarlas de mayor a menor ")
operacion =int(input("ingrese el valor del resultado a obtener"))
if operacion==1:
    print("el orden de menor a mayor es: ")
    print("naranja","manzana","pera","piña")
if operacion ==2:
    print("el orden mayor a menor es: ")
    print("piña","pera","manzana","naranja")
    
    
# ejercicio 18 

edad=int(input("ingrese su edaad: "))
valc=int(input("ingrese el valor de su compra: "))
if ((edad >14 and edad < 21) and valc >50000)or (valc>100000 and edad>21):  
    print("podras jugar a la volita feliz ")
else:
    print("usted no puede jugar al juego de la volita feliz")

import random
n= random.randint(0,5)
print("y el numero de la volita feliz ha sido el ",n)
if n==0:
    print("su premio es una plancha")
if n==1:    
    print("su premio es un desodorante")
if n==2:
    print("su premio es un paqueté de jamón")
if n==3:
    print("su premio es una escoba")
if n==4:
    print("su premio es una gaseosa personal")
if n==5:
    print("su premio es que gana 50000 pero los donará a una ong")
    
    
    
    
    
    
    