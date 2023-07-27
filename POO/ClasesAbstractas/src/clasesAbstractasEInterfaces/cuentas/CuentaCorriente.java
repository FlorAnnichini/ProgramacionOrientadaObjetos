package clasesAbstractasEInterfaces.cuentas;

import clasesAbstractasEInterfaces.Cheque;
import clasesAbstractasEInterfaces.Cliente;
import clasesAbstractasEInterfaces.GravadorImpuesto;

public class CuentaCorriente extends Cuenta implements GravadorImpuesto {

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

    public void depositar(Cheque cheque){
        depositar(cheque.getMonto());
    }

    @Override
    public Double gravarImpuesto(Double porcentajeImpuesto) {
        Double impuestoRestado = getSaldo() * porcentajeImpuesto;
        setSaldo(getSaldo()-impuestoRestado);
        return impuestoRestado;
    }
}
