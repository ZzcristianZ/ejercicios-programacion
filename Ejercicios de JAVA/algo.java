import java.util.Scanner;
public class algo {

    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
        
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
        