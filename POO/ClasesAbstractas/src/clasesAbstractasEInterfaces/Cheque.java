package clasesAbstractasEInterfaces;

import java.util.Date;

public class Cheque {

    private String banco;
    private Double monto;
    private Date fechaEmision;

    public Cheque(String banco, Double monto, Date fechaEmision) {
        this.banco = banco;
        this.monto = monto;
        this.fechaEmision = fechaEmision;
    }

    public Double getMonto() {
        return monto;
    }
}
