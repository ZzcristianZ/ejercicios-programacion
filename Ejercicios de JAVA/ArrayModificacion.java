public class ArrayModificacion {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Antes de modificar:");
        mostrarArray(numeros);

        modificarArray(numeros);

        System.out.println("Después de modificar:");
        mostrarArray(numeros);
    }

    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; 
        }
    }

    public static void mostrarArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
