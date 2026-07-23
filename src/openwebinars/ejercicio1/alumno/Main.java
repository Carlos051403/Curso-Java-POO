package openwebinars.ejercicio1.alumno;

public class Main {
    public static void main (String[] args){

       /* Alumno a1 = new Alumno();
        a1.setNombre("Carlos");
        a1.setApellidos("Reyes");
        a1.setEdad(30);
        a1.setEmail("carlos.reyes@centroeducativo.com");

        System.out.println(a1);

        Alumno a2 = new Alumno("Verusca", "Reyes", 15);
        a2.setEmail("Veru@centroeducativo.com");
        a2.setTelefono("60012345678");

        System.out.println(a2);

        System.out.println("La alumna %s %s %s mayor de edad"
                .formatted(
                        a2.getNombre(),
                        a2.getApellidos(),
                        a2.esMayorEdad() ? "sí" : "no"
                ));

        if (a1.equals(a2)) {
            System.out.println("Son el mismo objeto");
        }else {
            System.out.println("No son el mismo objeto");
        }*/

        //Objetos mediante Arrays
        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Jose", "García López", 14);
        alumnos[1] = new Alumno("María", "Fernandez Martín", 17);
        alumnos[2] = new Alumno("Raúl", "Miraflores Redondo", 11);
        alumnos[3] = new Alumno("Lucía", "Muñoz Seco",16);
        alumnos[4] = new Alumno("Antonio", "De la Cruz", 19);

        int posicionMasJoven = 0;

        for(int i = 1; i < alumnos.length; i++){

            /*
            Alumno a1 = alumnos[posicionMasJoven];
            Alumno a2 = alumnos[i];

            if (a1.getEdad() > a2.getEdad()) {
                posicionMasJoven = i;
            }
            */


            //En este if podemos resumir toda la linea de codigo de arriba
            if (alumnos[posicionMasJoven].getEdad() > alumnos[i].getEdad()){
                posicionMasJoven = i;
            }
        }

        Alumno joven = alumnos[posicionMasJoven];
        System.out.println("El alumno más joven es %s %s con %d años"
                .formatted(joven.getNombre(), joven.getApellidos(), joven.getEdad()));

    }
}
