package ecommerce;

public class Envio {

    String numSeguimiento;
    Double peso;
    String estadoDelPaquete;

    public Envio() {
    }

    public Envio(String numSeguimiento, Double peso, String estadoDelPaquete) {
        this.numSeguimiento = numSeguimiento;
        this.peso = peso;
        this.estadoDelPaquete = estadoDelPaquete;
    }

    public String getNumSeguimiento() {
        return numSeguimiento;
    }

    public void setNumSeguimiento(String numSeguimiento) {
        this.numSeguimiento = numSeguimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEstadoDelPaquete() {
        return estadoDelPaquete;
    }

    public void setEstadoDelPaquete(String estadoDelPaquete) {
        this.estadoDelPaquete = estadoDelPaquete;
    }

    // Método 1: Actualización normal (solo recibe el estado)
    public void actualizarEstado (String nuevoEstado){
        this.estadoDelPaquete = nuevoEstado;
        System.out.println("El paquete ahora está: " + this.estadoDelPaquete);
    }

    // Método 2: La SOBRECARGA (Mismo nombre, pero recibe estado Y firma)
    public void actualizarEstado (String nuevoEstado, String personaFirma) {
        this.estadoDelPaquete = nuevoEstado;
        System.out.println("El paquete ahora está: " + this.estadoDelPaquete +
                " | Entregado a: " + personaFirma);
    }

    public Double calcularCosto(){
        return this.peso * 5.0;
    }
}
