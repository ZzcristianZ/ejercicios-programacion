import java.util.Scanner;
public class algo {
    public static void main(String[] args) {
       Scanner escaner=new Scanner(System.in);
        double[] Dias_Mes=new double[30];
        int ventas;
        int total=0;
        for (int i = 0; i < Dias_Mes.length; i++) {
            System.out.println("ingrese las ventas del dia "+i);
            ventas=escaner.nextInt();
            Dias_Mes[i]=ventas;
            total=total+ventas;
        }
        System.out.println("el total del mes es "+total);
    }
}
