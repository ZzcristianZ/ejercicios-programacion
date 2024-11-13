import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner escaner=new Scanner (System.in);

        System.out.println("ingrese un numero");
        int numero=escaner.nextInt();

        int nulo;
        int numeroFinal=1;
        int valor_cero=0;

        for (int i = 0; i < numero; i++) {
            nulo=valor_cero;
            valor_cero=numeroFinal+valor_cero;
            numeroFinal=nulo;
            System.out.println(numeroFinal);
        }
        escaner.close();
    }
}
