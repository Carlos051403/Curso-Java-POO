package inventariotech;

public class Laptop extends Producto {

    int memoriaRAM;
    boolean tieneTarjetaGrafica;

    public Laptop(int codigo, String marca, String modelo, Double precioBase,
                  int memoriaRAM, boolean tieneTarjetaGrafica) {
        super(codigo, marca, modelo, precioBase);
        this.memoriaRAM = memoriaRAM;
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public boolean isTieneTarjetaGrafica() {
        return tieneTarjetaGrafica;
    }

    public void setTieneTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public void encender(){

        System.out.println("Iniciando Sistema con " + this.memoriaRAM + " GB de RAM");
    }
}
