import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            double numero1, numero2, resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 - numero2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    resultado = numero1 * numero2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = scanner.nextDouble();
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
