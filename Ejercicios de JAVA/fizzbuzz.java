import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {

        Scanner escaner=new Scanner (System.in);

        int numero=escaner.nextInt();
        
     
        for (int i = 0; i <=numero; i++) {
            
            if (i%3==0 & i%5==0) {
                System.out.println("fizzbuzz"); 
            }else if (i%3==0) {
                System.out.println("fizz");
                
            }else if (i%5==0) {
                System.out.println("buzz");
            } else{
                System.out.println(i);
            }
        }
    }
    
}