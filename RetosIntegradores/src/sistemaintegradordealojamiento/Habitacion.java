package sistemaintegradordealojamiento;

public abstract class Habitacion implements OperacionesHotel {

    private int numeroHabitacion;
    private double precioBase;
    private String[] historialMantenimiento = new String[3];

    protected Habitacion(int numeroHabitacion, double precioBase) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioBase = precioBase;
    }

    protected int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    protected void setNumeroHabitacion (int numeroHabitacion){
        this.numeroHabitacion = numeroHabitacion;
    }

    protected double getPrecioBase(){
        return precioBase;
    }

    protected void setPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }

    protected abstract double calcularTarifaFinal();

    public void agregarMantenimiento(String detalle){
        historialMantenimiento[0] = historialMantenimiento[1];
        historialMantenimiento[1] = historialMantenimiento[2];
        historialMantenimiento[2] = detalle;
    }

}
