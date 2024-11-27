class Empleado {
    private String nombre;
    private String ID;
    private double salarioBase;

    public Empleado(String nombre, String ID, double salarioBase) {
        this.nombre = nombre;
        this.ID = ID;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + ID);
        System.out.println("Salario Base: " + salarioBase);
    }
}

class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, String ID, double salarioBase, double bonificacion) {
        super(nombre, ID, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonificacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bonificación: " + bonificacion);
    }
}

class Desarrollador extends Empleado {
    private String tecnologia;

    public Desarrollador(String nombre, String ID, double salarioBase, String tecnologia) {
        super(nombre, ID, salarioBase);
        this.tecnologia = tecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tecnología: " + tecnologia);
    }
}

public class GestionEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alice", "E001", 3000);
        Gerente gerente1 = new Gerente("Bob", "G001", 5000, 1500);
        Desarrollador desarrollador1 = new Desarrollador("Charlie", "D001", 4000, "Java");

        System.out.println("Información del empleado:");
        empleado1.mostrarInformacion();
        System.out.println("Salario Total: " + empleado1.calcularSalario());

        System.out.println("\nInformación del gerente:");
        gerente1.mostrarInformacion();
        System.out.println("Salario Total: " + gerente1.calcularSalario());

        System.out.println("\nInformación del desarrollador:");
        desarrollador1.mostrarInformacion();
        System.out.println("Salario Total: " + desarrollador1.calcularSalario());
    }
}
