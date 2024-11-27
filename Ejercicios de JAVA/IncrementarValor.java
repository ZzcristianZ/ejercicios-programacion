public class IncrementarValor {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Valor inicial de x: " + x);

        incrementar(x);

        System.out.println("Valor de x después de llamar a incrementar (sin usar el valor retornado): " + x);

        x = incrementar(x);

        System.out.println("Valor de x después de usar el valor retornado: " + x);
    }

    public static int incrementar(int x) {
        x = x + 1;
        return x;
    }
}
