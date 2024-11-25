public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Ahorros");
        // Intentar acceder directamente a numeroCuenta debería generar error de compilación
        cuenta.setSaldo(1500.0);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}