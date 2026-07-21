package inventariotech;

public class Producto {

    int codigo;
    String marca;
    String modelo;
    Double precioBase;

    public Producto() {
    }

    public Producto(int codigo, String marca, String modelo, Double precioBase) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void mostrarResumen() {

        System.out.println("Este es un resumen de producto: ");
        System.out.println("Producto: " + this.marca + " " + this.modelo + " - precio: $" + this.precioBase);

    }
}
