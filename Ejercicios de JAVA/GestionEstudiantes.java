import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getCalificacion());
        }
    }

    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        gestion.agregarEstudiante(new Estudiante("Ana", 95));
        gestion.agregarEstudiante(new Estudiante("Juan", 85));
        gestion.mostrarEstudiantes();
    }
}

class Estudiante {
    private String nombre;
    private int calificacion;

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
