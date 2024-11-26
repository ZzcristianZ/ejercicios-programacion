public class RetiroBanco {
    public static void main(String[] args) {
        double saldoInicial = 1000.00;

        double retiroSemanal = 200.00;

        int semanasEnMes = 4;

        double totalRetirado = retiroSemanal * semanasEnMes;
        double saldoRestante = saldoInicial - totalRetirado;

        System.out.println("Saldo restante después de un mes: $" + saldoRestante);
    }
}
