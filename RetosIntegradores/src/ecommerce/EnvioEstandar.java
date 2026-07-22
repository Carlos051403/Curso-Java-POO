package ecommerce;

public class EnvioEstandar extends Envio {

    public EnvioEstandar(String numSeguimiento, Double peso, String estadoDelPaquete) {
        super(numSeguimiento, peso, estadoDelPaquete);
    }

    @Override
    public Double calcularCosto(){
        return super.calcularCosto() + 10.0;
    }
}
