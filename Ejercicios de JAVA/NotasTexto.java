import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class NotasTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ingresar una nota");
        System.out.println("2. Leer notas guardadas");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        if (opcion == 1) {
            System.out.print("Ingresa la nota: ");
            String nota = scanner.nextLine();
            try (FileWriter writer = new FileWriter("notas.txt", true)) {
                writer.write(nota + "\n");
                System.out.println("Nota guardada.");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al guardar la nota.");
            }
        } else if (opcion == 2) {
            try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al leer las notas.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
        scanner.close();
    }
}
