public class numerosPrimos {
    public static void main(String[] args) {
        int contador_de_divisores=0;
        for(int i=1;i<=100;i++){
            contador_de_divisores=0;
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0) {
                    contador_de_divisores+=2;
                }else if (contador_de_divisores>2) {
                    break;
                }
            }
            if (contador_de_divisores==2) {
                System.out.println(i);
            }
        }
    }
}
