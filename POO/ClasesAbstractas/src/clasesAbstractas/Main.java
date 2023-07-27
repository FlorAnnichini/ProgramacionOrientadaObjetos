package clasesAbstractas;

import clasesAbstractas.cuentas.CajaAhorro;
import clasesAbstractas.cuentas.Cuenta;
import clasesAbstractas.cuentas.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
/*
 Trabajo de practica del sistema de clases abstractas con un modelo bancario
 de clientes y cuentas desarrollado desde el lado del banco.
 Separe en otro package las cuentas asi no son accesibles (por el protected).
*/

        Cliente cliente1 = new Cliente("1", "Perez", "1234567", "2712345670");
        Cliente cliente2 = new Cliente("2", "Lopez", "34567", "27345670");

        Cuenta cuenta1 = new CajaAhorro(cliente1, 0.02);
        Cuenta cuenta2 = new CuentaCorriente(cliente2, 300.0);

        System.out.println("Cuenta 1");
        cuenta1.depositar(500.0);

        cuenta1.extraer(1000.0);
        cuenta1.extraer(-100.0);
        cuenta1.extraer(200.0);

        System.out.println("Cuenta 2");
        cuenta2.depositar(500.0);

        cuenta2.extraer(2000.0);
        cuenta2.extraer(-100.0);
        cuenta2.extraer(800.0);
    }


}