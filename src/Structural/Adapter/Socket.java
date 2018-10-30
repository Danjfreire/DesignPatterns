package Structural.Adapter;

/**
 * Essa classe representa uma tomada que por padrão é de 120v.
 * Ela não possui nenhuma configuração, só retorna 120v sempre.
 */

public class Socket {

    public Volt getVoltage(){
        return new Volt(120);
    }

}
