package sistemaintegradordealojamiento;

public class Suite extends Habitacion{

    private boolean tieneJacuzzi;


    protected Suite(int numeroHabitacion, double precioBase, boolean tieneJacuzzi) {
        super(numeroHabitacion, precioBase);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    @Override
    protected double calcularTarifaFinal() {
        double precioFinal = this.getPrecioBase();

        if (this.tieneJacuzzi) {
            precioFinal += 50.0;
        }
        return precioFinal;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento de la Suite Realizada");
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double precioFinal = this.getPrecioBase();

        if (!this.tieneJacuzzi) {
            precioFinal = precioFinal - (precioFinal * porcentaje);
        }
        return precioFinal;
    }
}
