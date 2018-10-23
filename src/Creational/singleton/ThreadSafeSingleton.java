package Creational.singleton;

/**
 * Essa implementação garante que a classe seja thread-safe,
 * contudo, existe um custo a mais de performance por conta
 * do método ser synchronized
 */

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null)
            instance = new ThreadSafeSingleton();
        return instance;
    }
}
