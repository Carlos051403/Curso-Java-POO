package motordefacturacion;

import java.util.Objects;

public abstract class Plan {

    protected String correo;
    protected double precioBase;

    protected Plan(String correo, double precioBase) {
        this.correo = correo;
        this.precioBase = precioBase;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calculoDeCosto ();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Double.compare(precioBase, plan.precioBase) == 0 && Objects.equals(correo, plan.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, precioBase);
    }

}
