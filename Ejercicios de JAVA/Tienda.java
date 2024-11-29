import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + ": " + producto.getPrecio());
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.agregarProducto(new Producto("Manzana", 1.0));
        tienda.agregarProducto(new Producto("Naranja", 0.75));
        tienda.mostrarProductos();
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
