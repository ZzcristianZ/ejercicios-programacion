import java.util.ArrayList;

public class SistemaReservas {
    private ArrayList<Vuelo> vuelos;

    public SistemaReservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo.getCodigo() + ": " + vuelo.getDestino());
        }
    }

    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        sistema.agregarVuelo(new Vuelo("AA101", "New York"));
        sistema.agregarVuelo(new Vuelo("BA202", "London"));
        sistema.mostrarVuelos();
    }
}

class Vuelo {
    private String codigo;
    private String destino;

    public Vuelo(String codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }
}
