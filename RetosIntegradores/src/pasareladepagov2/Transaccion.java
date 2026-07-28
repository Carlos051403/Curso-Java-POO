package pasareladepagov2;

public abstract class Transaccion {

    protected double monto;
    protected String correoUsuario;

    public Transaccion(double monto, String correoUsuario) {
        this.monto = monto;
        this.correoUsuario = correoUsuario;
    }

    public double getMonto() {
        return monto;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public abstract boolean procesarPago();
}
