package herencia;

public class Main {
    public static void main (String[] args) {

        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();

        Persona perso = new Persona();
        Consultor consul = new Consultor();

        // gracias al polimorfismo se puede guardar un objeto dentro de otro
        perso = consul;

        /*En cambio si a consul = perso; no deja asignar porque ya pide que hagamos
        un casteo es decir transformar la persona, se puede asignar un hijo a su padre,
        pero no un padre a su hijo
         */

    }
}
