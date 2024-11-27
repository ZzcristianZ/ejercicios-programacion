public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void mostrarInformacion() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }

    public static void modificarRectangulo(Rectangulo rectangulo, double nuevoAncho, double nuevoAlto) {
        rectangulo.setAncho(nuevoAncho);
        rectangulo.setAlto(nuevoAlto);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4.0, 5.0);

        System.out.println("Información inicial:");
        rectangulo1.mostrarInformacion();

        modificarRectangulo(rectangulo1, 10.0, 12.0);

        System.out.println("Después de modificar los atributos:");
        rectangulo1.mostrarInformacion();
    }
}
