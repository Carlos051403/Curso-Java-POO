package pasareladepagov2;

public class Criptomoneda extends Transaccion implements Auditable {

    public Criptomoneda(double monto, String correoUsuario) {
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
}
