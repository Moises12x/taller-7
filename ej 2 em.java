public class Empleado {
    public String nombre; 
    private double salario; 

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }
}
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Juan"; 
        emp.setSalario(5000); 
        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.getSalario()); 
    }
}