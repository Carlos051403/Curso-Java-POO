package motordefacturacion;

public class PlanEstandar extends Plan{

    public PlanEstandar(String correo, double precioBase) {
        super(correo, precioBase);
    }

    @Override
    public double calculoDeCosto() {
        double costoTotal = this.precioBase;
        return costoTotal;
    }


}
