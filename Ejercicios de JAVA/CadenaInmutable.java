public class CadenaInmutable {
    public static void main(String[] args) {
        String texto = "Hola, Mundo";

        System.out.println("Valor inicial de la cadena: " + texto);

        modificarCadena(texto);

        System.out.println("Valor de la cadena después de llamar a modificarCadena: " + texto);
    }

    public static void modificarCadena(String texto) {
        texto = "Cadena modificada";

        System.out.println("Dentro del método modificarCadena: " + texto);
    }
}
