import java.util.Scanner;
public class numMayar_en_array {
    public static void main(String[] args) {
        
        Scanner escaner =new Scanner(System.in);

        int[] numeros_array=new int[5];
        System.out.println("ingrese 5 numeros");
        int Mayor=numeros_array[0];
        for (int i = 0; i < numeros_array.length; i++) {

            numeros_array[i]=escaner.nextInt();
            if (numeros_array[i]>Mayor) {
                Mayor=numeros_array[i];
            }
            
        }
        System.out.println("el mayor numero es "+Mayor);
        escaner.close();
    }
}
