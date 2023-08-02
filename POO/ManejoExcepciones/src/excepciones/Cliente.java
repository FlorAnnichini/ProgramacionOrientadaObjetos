package excepciones;

public class Cliente {

    private String numeroCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private Double saldo;
    private Double deuda;
    private Double limite;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String apellido, String dni, Double saldo, Double limite) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldo = saldo;
        this.deuda = 0.0;
        this.limite = limite;
    }

    public void comprar(Double importe) throws Exception{
        if(limite >= importe){
            saldo -= importe;
        }else{
            throw new ClienteException("Tu limite es menor al saldo que ingresaste");
        }
    }

    public void saldarDeuda(Double importe) throws ClienteException{
        if(deuda == 0.0){
            // Aca puse ClientException para especificar que tipo de exception es pero podria ir como en el metodo anterior
            throw new ClienteException("No hay deudas a saldar");
        }
        if(deuda < importe){
            // Aca puse ClientException para especificar que tipo de exception es pero podria ir como en el metodo anterior
            throw new ClienteException("El saldo de la deuda es menor al importe que quiere ingresar");
        }
        deuda-=importe;
    }

}
