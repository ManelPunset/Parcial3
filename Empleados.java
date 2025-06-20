/**
 * Clase que gestiona un conjunto de empleados y operaciones sobre ellos.
 */
public class Empleados {
    /** Array que almacena la lista de empleados */
    public Empleado[] lista;

    /**
     * Constructor que inicializa la lista de empleados con una cantidad fija.
     * @param cantidad Número de empleados a gestionar
     */
    public Empleados(int cantidad) {
        this.lista = new Empleado[cantidad];
    }

    /**
     * Da de alta un empleado en la posición indicada del array.
     * @param indice Índice donde se insertará el empleado
     * @param nombre Nombre del empleado
     * @param cargo Cargo del empleado
     * @param salario Salario del empleado
     */
    public void altaEmpleado(int indice, String nombre, String cargo, double salario) {
        if (indice >= 0 && indice < lista.length) {
            lista[indice] = new Empleado(nombre, cargo, salario);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla la lista de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
