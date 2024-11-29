public class InvertirCadena {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String invertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + invertida);
    }

    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        return invertida;
    }
}
