import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo (" + numero2 + ") y menor que el tercero (" + numero3 + ").");
        } else {
            System.out.println("El primer número (" + numero1 + ") no cumple con la condición de ser mayor que el segundo (" + numero2 + ") y menor que el tercero (" + numero3 + ").");
        }

        scanner.close();
    }
}
