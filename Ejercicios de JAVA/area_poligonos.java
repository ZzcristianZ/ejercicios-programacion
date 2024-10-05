import java.util.Scanner;
public class area_poligonos {

    public static void main(String[] args) {
        Scanner escaner=new Scanner (System.in);
        System.out.println("1 para triangulo 2 para cuadrado y 3 para rectangulo");
        int numero=escaner.nextInt();
        
        System.out.println("ingrese la base");
        int base=escaner.nextInt(); 
        
        System.out.println("ingrese la altura");
        int altura=escaner.nextInt(); 
        
        switch (numero) {
            case 1:
                    System.out.println("el area del triangulo es "+(base*altura)/2);
                    
                    break;
            case 2:
                    
                    System.out.println("el area del triangulo es "+(base*altura));
                    
                    break;
                    
            case 3:
                    
                    System.out.println("el area del triangulo es "+(base*altura));
                    break;
            default:
                break;
        }

    }
}