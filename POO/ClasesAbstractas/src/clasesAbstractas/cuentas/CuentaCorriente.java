package clasesAbstractas.cuentas;

import clasesAbstractas.Cliente;
import clasesAbstractas.cuentas.Cuenta;

public class CuentaCorriente extends Cuenta {

    private Double descubiertoPermitido;

    public CuentaCorriente(Cliente cliente, Double descubiertoPermitido) {
        super(cliente);
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(Double monto) {
        if(getSaldo() + descubiertoPermitido >= monto && monto > 0){
            setSaldo(getSaldo()-monto);
            System.out.println("su saldo actual es de " + getSaldo());
        }else{
            System.out.println("saldo insuficiente");
        }
    }
}
