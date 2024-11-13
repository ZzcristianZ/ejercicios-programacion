

public class anagrama {
    public static void main(String[] args) {
        
        
        char [] palabra_1= {'A','M','O','R'};
        char [] palabra_2={'R','O','M','A'};

        int contador = 0;
        int long_palabra_1=palabra_1.length;
        
        
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