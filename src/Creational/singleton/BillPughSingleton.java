package Creational.singleton;

/**
 * Nessa abordagem do padrão singleton, criada por Bill Pugh,
 * é utilizada uma classe estática interna para criar a instancia.
 * Desta forma a classe interna só é carregada após a chamada do
 * getInstance, essa implementação garante um singleton thread-safe
 * sem a utilização de synchronized
 */

public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
