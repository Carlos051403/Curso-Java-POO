package pasareladepagov2;

public class Main {
    public static void main (String[] args) {

        TarjetaDeCredito pagoTarjeta = new TarjetaDeCredito(192.80, "Carlos@gmail.com");
        Criptomoneda cripto = new Criptomoneda(548.90, "Eduardo@hotmail.com");

        pagoTarjeta.procesarPago();
        pagoTarjeta.generarReciboFiscal();
        pagoTarjeta.reembolsar();

        System.out.println("\\--------------------------------- ");

        cripto.procesarPago();
        cripto.generarReciboFiscal();
    }
}
