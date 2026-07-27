package motordefacturacion;

import java.util.Objects;

public class PlanFamiliar extends Plan{

    private int pantallasExtras;

    public PlanFamiliar(String correo, double precioBase, int pantallasExtras) {
        super(correo, precioBase);
        this.pantallasExtras = pantallasExtras;
    }

    public int getPantallasExtras() {
        return pantallasExtras;
    }

    public void setPantallasExtras(int pantallasExtras) {
        this.pantallasExtras = pantallasExtras;
    }

    @Override
    public double calculoDeCosto() {
        double costoPantallaExtra = this.pantallasExtras * 3.50;
        double costoTotal = this.precioBase + costoPantallaExtra;
        return costoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PlanFamiliar that = (PlanFamiliar) o;
        return pantallasExtras == that.pantallasExtras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pantallasExtras);
    }

}
