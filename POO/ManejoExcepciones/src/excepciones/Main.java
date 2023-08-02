package excepciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("123", "Graciela", "Lopez","2345678",2000.0,500.0);

        try {
            cliente.comprar(200.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        List<Integer> numeros = new ArrayList<>();

        try {
           numeros.get(10);
        }catch (ClassCastException ce){
            System.out.println("Fallo porque casteo mal aunque este no es el caso");
            ce.printStackTrace();
        }catch (Exception e){
            System.out.println("Asi puedo ir agregando todas las excepciones que quiera!");
            System.out.println("Esta excepcion siempre iria ultima por ser la mas abarcativa");
        e.printStackTrace();
        }

        // Esto es para mostrar que el codigo se sigue corriendo y no se rompe
        System.out.println("Mi codigo termina aca");

    }
}