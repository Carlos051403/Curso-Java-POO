package Logica;

public class POO {
    public static void main (String[] arg){

        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (5, "Carlos", "Reyes");

        if (alu1.saberAprobado(7.5)) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uyy no aprobé");
        }
    }
}
