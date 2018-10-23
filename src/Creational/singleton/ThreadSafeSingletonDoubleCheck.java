package Creational.singleton;

/**
 * Essa versão do singleton thread-safe garante uma performance
 * melhor, visto que o bloco synchronized só será acessado caso
 * a instância ainda não tenha sido setada;
 */

public class ThreadSafeSingletonDoubleCheck {

    private static ThreadSafeSingletonDoubleCheck instance;

    private ThreadSafeSingletonDoubleCheck(){}

    public static ThreadSafeSingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingletonDoubleCheck.class){
                if(instance == null)
                    instance = new ThreadSafeSingletonDoubleCheck();
            }
        }
        return instance;
    }
}
