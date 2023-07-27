package clasesAbstractasEInterfaces;

import clasesAbstractasEInterfaces.cuentas.CajaAhorro;
import clasesAbstractasEInterfaces.cuentas.Cuenta;
import clasesAbstractasEInterfaces.cuentas.CuentaCorriente;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
/*
 Trabajo de practica del sistema de clases abstractas e interfaces con un modelo bancario
 de clientes y cuentas desarrollado desde el lado del banco.
 Separe en otro package las cuentas asi no son accesibles (por el protected).
 Muchos de los "sout" que fui haciendo son mas a modo explicativo que de uso real.
*/

        Cliente cliente1 = new Cliente("1", "Perez", "1234567", "2712345670");
        Cliente cliente2 = new Cliente("2", "Lopez", "34567", "27345670");

        Cuenta cuenta1 = new CajaAhorro(cliente1, 0.02);
        Cuenta cuenta2 = new CuentaCorriente(cliente2, 300.0);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(new Cliente(), 3000.0);

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

        System.out.println("Cuenta Corriente");
        Cheque cheque = new Cheque("Santander", 2000.0, new Date());

        cuentaCorriente.depositar(cheque);
        System.out.println("Saldo cuenta corriente actual: " + cuentaCorriente.informarSaldo());
        System.out.println("El impuesto grabado fue de " + cuentaCorriente.gravarImpuesto(0.1));

    }

}