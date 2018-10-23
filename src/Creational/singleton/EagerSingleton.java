package Creational.singleton;

/**
 * Nessa implementação do singleton, a instância da classe é criada
 * no momento em que a classe é carregada. Tem a desvantagem de setar
 * a instancia mesmo sem ter sido requisitada pela aplicação
 */

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
