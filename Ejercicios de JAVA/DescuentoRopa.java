public class DescuentoRopa {
    public static void main(String[] args) {
        double precioCamiseta = 25.00;
        double precioPantalon = 30.00;

        double descuentoCamiseta = precioCamiseta * 0.15;
        double precioDescontadoCamiseta = precioCamiseta - descuentoCamiseta;

        double descuentoPantalon = precioPantalon * 0.15;
        double precioDescontadoPantalon = precioPantalon - descuentoPantalon;

        double descuentoAdicional = precioDescontadoCamiseta * 0.05;
        double precioDescontadoCamisetaAdicional = precioDescontadoCamiseta - descuentoAdicional;

        double precioTotal = precioDescontadoCamiseta + precioDescontadoPantalon + precioDescontadoCamisetaAdicional;

        System.out.println("Precio total después de descuentos: $" + precioTotal);
    }
}
