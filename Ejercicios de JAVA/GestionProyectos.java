import java.util.ArrayList;

public class GestionProyectos {
    private ArrayList<Proyecto> proyectos;

    public GestionProyectos() {
        proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void mostrarProyectos() {
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto.getNombre() + ": " + proyecto.getDescripcion());
        }
    }

    public static void main(String[] args) {
        GestionProyectos gestion = new GestionProyectos();
        gestion.agregarProyecto(new Proyecto("Proyecto A", "Descripción A"));
        gestion.agregarProyecto(new Proyecto("Proyecto B", "Descripción B"));
        gestion.mostrarProyectos();
    }
}

class Proyecto {
    private String nombre;
    private String descripcion;

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
