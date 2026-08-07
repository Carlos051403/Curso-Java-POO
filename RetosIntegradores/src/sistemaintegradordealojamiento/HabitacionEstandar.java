package sistemaintegradordealojamiento;

public class HabitacionEstandar extends Habitacion{

    protected HabitacionEstandar(int numeroHabitacion, double precioBase) {
        super(numeroHabitacion, precioBase);
    }

    @Override
    protected double calcularTarifaFinal() {
        return super.getPrecioBase();
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento de la Habitación Realizada");
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return 0;
    }
}
