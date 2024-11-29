public class BuscarMaximo {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5};
        int maximo = buscarMaximo(numeros);
        System.out.println("El valor máximo es: " + maximo);
    }

    public static int buscarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
