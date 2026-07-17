package Logica;

public class Alumno {

    int id;
    String nombre;
    String apellido;

    // Este es un metodo constructor vacio
    public Alumno() {
    }

    // Este es un metodo  constructor con parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Por convencion los setters y getters van antes o despues de los metodos


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
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
