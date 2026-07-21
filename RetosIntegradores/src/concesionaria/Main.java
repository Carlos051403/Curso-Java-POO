package concesionaria;

public class Main {
    public static void main (String[] args){

        Auto auto1 = new Auto(5860, "Renault", "Laguna",
                2011, 12500.00, 5,
                "Gasolina");

        Moto moto1 = new Moto(6058, "Yamaha", "Nmax",
                2019, 6800.0, 125, false);

        auto1.mostrarDatos();
        auto1.encenderMotor(true);

        moto1.mostrarDatos();
        moto1.acelerar();

    }

}
