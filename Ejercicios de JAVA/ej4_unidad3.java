public class ej4_unidad3 {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Antes de llamar al método: x = " + a);
        a = aumentado(a);  
        System.out.println("Después de llamar al método: x = " + a);
    }

    public static int aumentado(int a) {
        a += 1;
        System.out.println("Dentro del método: x = " + a);
        return a;
    }
}

  
