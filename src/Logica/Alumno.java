package Logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarNombre() {

        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public boolean saberAprobado (double calificacion) {

        if (calificacion >=6) {
            return true;
        }
        else {
            return false;
        }
    }
}
