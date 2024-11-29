class Rectangulo{

    double ancho;
    double alto;

    Rectangulo (double ancho, double alto){ 
        this.ancho=ancho;
        this.alto=alto;

    }

}

public class ej2_unidad3 {

    public static void main(String[] args) {
        Rectangulo rectangulo= new Rectangulo(10, 15);
        System.out.println(rectangulo.alto + " " + rectangulo.ancho);
        cambio(rectangulo);
        System.out.println(rectangulo.alto+" "+rectangulo.ancho);
    }

    public static void cambio (Rectangulo r){
        r.alto=0;
        r.ancho=5;
        System.out.println(r.alto+" "+r.ancho);
    }
}
