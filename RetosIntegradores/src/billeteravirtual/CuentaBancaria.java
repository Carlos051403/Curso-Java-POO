package billeteravirtual;

import java.util.Scanner;

public class CuentaBancaria {

    int numeroCuenta;
    String titular;
    double saldo;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean operacionBancaria (double cantidadDinero) {

        if (cantidadDinero > 0) {
            saldo += cantidadDinero;
            return true;
        }
        else {
            return false;
        }
    }
}
