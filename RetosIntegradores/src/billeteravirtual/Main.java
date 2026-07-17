package billeteravirtual;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(12345678, "Carlos", 350.50);

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuanto dinero deseas Ingresar?");
        double dineroIngresado = Double.parseDouble(teclado.nextLine());

        if (cuentaBancaria1.operacionBancaria(dineroIngresado)) {

            System.out.println("Ingreso Exitoso");
        } else {
            System.out.println("No se ha hecho ningun ingreso");
        }
    }
}
