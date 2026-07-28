package pasareladepagov2;

public class TarjetaDeCredito extends Transaccion implements Reembolsable, Auditable {


    public TarjetaDeCredito(double monto, String correoUsuario) {
        super(monto, correoUsuario);
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Conectando con el banco...");
        System.out.println("Cobro aprobado por $" + this.monto + " al usuario " + this.correoUsuario);
        return true;
    }

    @Override
    public void generarReciboFiscal() {
        System.out.println("Generando factura oficial para Hacienda por un monto de $"
                + this.monto);
    }

    @Override
    public void reembolsar() {
        System.out.println("Devolviendo $" + this.monto + " a la tarjeta del usuario "
                + this.correoUsuario);
    }
}
