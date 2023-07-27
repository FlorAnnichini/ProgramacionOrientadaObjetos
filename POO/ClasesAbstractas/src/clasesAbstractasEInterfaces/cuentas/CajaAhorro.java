package clasesAbstractasEInterfaces.cuentas;

import clasesAbstractasEInterfaces.Cliente;

public class CajaAhorro extends Cuenta {

    private Double tasaInteres;

    public CajaAhorro(Cliente cliente, Double tasaInteres) {
        super(cliente);
        this.tasaInteres = tasaInteres;
    }

    public void cobrarInteres(){
        setSaldo(getSaldo() + getSaldo()*tasaInteres);
    }

    @Override
    public void extraer(Double monto) {
        if(getSaldo() >= monto && monto > 0){
           setSaldo(getSaldo()-monto);
            System.out.println("su saldo actual es de " + getSaldo());
        }else{
            System.out.println("saldo insuficiente");
        }
    }
}
