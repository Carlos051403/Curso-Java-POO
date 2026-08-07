package sistemaintegradordealojamiento;

public class Main {
    public static void main (String[] args) {

        GestorHotel recepcion = new GestorHotel();

        HabitacionEstandar habitacionPrueba = new HabitacionEstandar(1, 120);

        recepcion.agregarHabitacion(habitacionPrueba);

        recepcion.mostrarTarifa();

    }
}
