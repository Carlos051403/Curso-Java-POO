package herencia;

public class Main {
    public static void main (String[] args) {

        Empleado emple = new Empleado();

        emple.getNum_legajo();
        emple.getNombre();

        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre();

    }
}
