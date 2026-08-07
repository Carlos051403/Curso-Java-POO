package sistemaintegradordealojamiento;

import java.util.ArrayList;

public class GestorHotel {

    private ArrayList<Habitacion> inventarioHabitaciones = new ArrayList<>();

    public void agregarHabitacion(Habitacion h){
        inventarioHabitaciones.add( new HabitacionEstandar(1, 120.00));
    }

    public void mostrarTarifa(){
        for (Habitacion habita:inventarioHabitaciones) {
            System.out.println("Habitacion #: " + habita.getNumeroHabitacion());
            double tarifaCobrar = habita.calcularTarifaFinal();
            System.out.println("El precio a cobrar es: " + tarifaCobrar);
        }
    }




}
