public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma de dos enteros: " + calculadora.sumar(3, 4)); // 7
        System.out.println("Suma de tres enteros: " + calculadora.sumar(1, 2, 3)); // 6
        System.out.println("Suma de dos números de punto flotante: " + calculadora.sumar(1.5, 2.5)); // 4.0

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Suma de un arreglo de enteros: " + calculadora.sumar(numeros)); // 15
    }
}
