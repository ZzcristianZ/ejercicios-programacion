import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}

class Usuario {
    private String nombre;
    private String ID;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void quitarLibroPrestado(Libro libro) {
        librosPrestados.remove(libro);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + ID);
        System.out.print("Libros Prestados: ");
        for (Libro libro : librosPrestados) {
            System.out.print(libro.getTitulo() + " ");
        }
        System.out.println();
    }
}

class Transaccion {
    private Usuario usuario;
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Transaccion(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        this.fechaDevolucion = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void realizarDevolucion() {
        libro.setDisponible(true);
        usuario.quitarLibroPrestado(libro);
        this.fechaDevolucion = new Date();
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha de Préstamo: " + fechaPrestamo);
        System.out.println("Fecha de Devolución: " + (fechaDevolucion == null ? "No devuelto" : fechaDevolucion));
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "1234567890");
        
        Usuario usuario1 = new Usuario("Juan Pérez", "U001");

        System.out.println("Información inicial del libro:");
        libro1.mostrarInformacion();
        
        System.out.println("\nInformación inicial del usuario:");
        usuario1.mostrarInformacion();

        if (libro1.isDisponible()) {
            usuario1.agregarLibroPrestado(libro1);
            libro1.setDisponible(false);
            Transaccion transaccion1 = new Transaccion(usuario1, libro1);
            System.out.println("\nInformación de la transacción de préstamo:");
            transaccion1.mostrarInformacion();
        }

        System.out.println("\nInformación del libro después del préstamo:");
        libro1.mostrarInformacion();
        
        System.out.println("\nInformación del usuario después del préstamo:");
        usuario1.mostrarInformacion();
    }
}
