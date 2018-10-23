package Creational.singleton;

/**
 * Nessa implementação do singleton, a instância só é criada
 * quando solicitada pela aplicação de forma global. Essa
 * implementação é comum e funciona bem na maioria dos casos,
 * contudo, ela apresenta problemas em ambientes multi-thread
 */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }

}
