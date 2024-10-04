import java.util.Scanner;

public class anagrama {
    public static void main(String[] args) {
        
        Scanner escaner= new Scanner(System.in);
        
        for (int i =0; i<4;i++){
            
            System.out.println("ingrese una palabra de cuatro letras ");
            String palabra = escaner.nextLine();
        
        }
        char [] palabra_1= {'A','M','O','R'};
        char [] palabra_2={'R','O','M','A'};

        int contador = 0;
        int long_palabra_1=palabra_1.length;
        int long_palabra_2=palabra_2.length;
        
        for (int i = 0; i < palabra_1.length; i++) {
            for (int j = 0; j < palabra_2.length; j++) {
                
                if (palabra_1[i]==palabra_2[j]) {
                    contador++;
                    palabra_2[j]=' ';
                    break;
                }
                
            }
        }
        if (contador==long_palabra_1) {
            System.out.println("son anagramas");
        }else{
            System.out.println("no son anagramas");
        }

    }
}