/**
 * Clase principal que ejecuta la aplicación de gestión de empleados.
 */
import java.util.Scanner;

public class SistemaGestionEmpleados {
    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.altaEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.altaEmpleado(1, "María", "Diseñadora", 45000);
        empleados.altaEmpleado(2, "Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
