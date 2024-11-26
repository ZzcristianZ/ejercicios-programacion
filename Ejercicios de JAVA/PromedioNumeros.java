import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio de los números es: " + promedio);

        scanner.close();
    }
}
