package ecommerce;

public class EnvioExpress extends Envio {

    boolean transporteRefrigerado;

    public EnvioExpress(String numSeguimiento, Double peso, String estadoDelPaquete,
                        boolean transporteRefrigerado) {
        super(numSeguimiento, peso, estadoDelPaquete);
        this.transporteRefrigerado = transporteRefrigerado;
    }

    public boolean isTransporteRefrigerado() {
        return transporteRefrigerado;
    }

    public void setTransporteRefrigerado(boolean transporteRefrigerado) {
        this.transporteRefrigerado = transporteRefrigerado;
    }

    @Override
    public Double calcularCosto(){

        Double total = this.peso * 15;

        if (this.transporteRefrigerado == true){
            total += 50.00;
        }
        return total;
    }
}
