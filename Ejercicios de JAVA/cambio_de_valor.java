import java.util.Scanner;
public class cambio_de_valor {

    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num= escaner.nextInt();
        System.out.println("el numero es "+num);
        cambio(num);
        System.out.println("hola mi numero es "+num);
        escaner.close();
    }
    public static void cambio(int num){
        num=5;
        System.out.println("ahora el numero es "+num);
    }
}
        