package inventariotech;

public class Auricular extends Producto {

    boolean esInalambrico;
    int horasBaterias;

    public Auricular(int codigo, String marca, String modelo, Double precioBase,
                     boolean esInalambrico, int horasBaterias) {
        super(codigo, marca, modelo, precioBase);
        this.esInalambrico = esInalambrico;
        this.horasBaterias = horasBaterias;
    }

    public boolean isEsInalambrico() {
        return esInalambrico;
    }

    public void setEsInalambrico(boolean esInalambrico) {
        this.esInalambrico = esInalambrico;
    }

    public int getHorasBaterias() {
        return horasBaterias;
    }

    public void setHorasBaterias(int horasBaterias) {
        this.horasBaterias = horasBaterias;
    }

    public void conectarBluetooth(){

        if (this.esInalambrico == true){
            System.out.println("Conectando al dispositivo");
        } else {
            System.out.println("Este Auricular requiere conexión por cable");
        }
    }
}
