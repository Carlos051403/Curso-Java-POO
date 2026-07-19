package logica;

public class POO {
    public static void main (String[] arg){

        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (5, "Carlos", "Reyes");

        if (alu1.saberAprobado(7.5)) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uyy no aprobé");
        }

        // Esto es cuando tenemos constructores con parametros
        // GET es para traer los datos
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es : " + alu2.getApellido());

        //Este es sin parametros y nosotros le colocamos los valores
        //SET es para colocar datos la primera vez si tenemos un objeto vacio
        alu1.setId(8);
        alu1.setNombre("Alejandro");
        alu1.setApellido("Reyes");

        System.out.println("---------------------------");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es : " + alu1.getApellido());

        //SET tambien sirve para modificar algun valor ya cargado
        alu2.setId(35);

        System.out.println("---------------------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es : " + alu2.getApellido());
    }
}
