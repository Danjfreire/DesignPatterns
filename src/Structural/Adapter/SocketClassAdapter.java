package Structural.Adapter;

/**
 * Esse é um adapter de classe para o socket. O adapter de classe utiliza herança
 * para acessar as características do objeto que está adaptando. Além disso também
 * deve implementar a interface do nosso adapter. Para realizar a adaptação
 * criamos um método adicional para converter a voltagem.
 */

public class SocketClassAdapter extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        // O método getVoltage é invocado da superclasse Socket
        return getVoltage();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVoltage();
        return convertVoltage(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVoltage();
        return convertVoltage(v,40);
    }

    private Volt convertVoltage(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
