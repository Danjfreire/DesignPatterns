package Creational.factory;

/**
 * Essa é a classe de fábrica, ela utiliza os inputs do seu método
 * para identificar qual instância deve retornar. Essa classe pode ser
 * implementada como singleton ou com factory method estático
 */

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
