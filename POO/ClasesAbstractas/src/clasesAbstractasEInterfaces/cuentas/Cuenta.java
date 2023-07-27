package clasesAbstractasEInterfaces.cuentas;

import clasesAbstractasEInterfaces.Cliente;

public abstract class Cuenta implements Comparable<Cuenta>{

    private Cliente cliente;
    private Double saldo;

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        saldo = 0.0;
    }

    public void depositar(Double monto){
        saldo += monto;
    }

    public abstract void extraer(Double monto);

    public Double informarSaldo() {
        System.out.println("Saldo: " + saldo);
        return saldo;
    }

    protected Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta otraCuenta){
        if(this.saldo > otraCuenta.saldo){
            return 1;
        }else if(this.saldo < otraCuenta.saldo){
            return -1;
        }else{
            return 0;
        }
    }

}
