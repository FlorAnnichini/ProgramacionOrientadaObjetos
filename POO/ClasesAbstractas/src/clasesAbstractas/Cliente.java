package clasesAbstractas;

public class Cliente {

    private String numeroCliente;
    private String apellido;
    private String dni;
    private String cuil;

    public Cliente(String numeroCliente, String apellido, String dni, String cuil) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
    }
}
