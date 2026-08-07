package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        // Creacion de Arrayslist
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1, "Carlos", 35));
        lista.add(new Persona(2, "Eduardo", 30));
        lista.add(new Persona(3, "Veru", 18));
        lista.add(new Persona(4, "Gabriel", 27));

        //Para recorrer tenemos el for normal o el for each
        // Recorrer por índice
        System.out.println("--------FOR---------");
        for (int i = 0; i<lista.size(); i++) { //Usamos en vez de .length, usamos .size porque es dinamico
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }

        System.out.println("-------FOREACH-------");
        //Si quiero recorrer elemento por elemento
        //for each = por cada
        for (Persona perso:lista){
            System.out.println("Prueba: " + perso.getNombre());
        }


    }
}
