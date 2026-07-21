package inventariotech;

public class Main {
    public static void main (String[] args) {

        Laptop laptop1 = new Laptop(1,"Lenovo", "Legion", 1200.00, 16, true);
        Auricular auricular1 = new Auricular(2, "Jesseanbarg", "Run", 40.50, true, 40);

        laptop1.mostrarResumen();
        laptop1.encender();

        auricular1.mostrarResumen();
        auricular1.conectarBluetooth();
    }
}
