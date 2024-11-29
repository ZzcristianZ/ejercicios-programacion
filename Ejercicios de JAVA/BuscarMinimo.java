public class BuscarMinimo {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5};
        int minimo = buscarMinimo(numeros);
        System.out.println("El valor mínimo es: " + minimo);
    }

    public static int buscarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }
}
