package Structural.Adapter;

/**
 * Esse é um adapter de objeto para o socket. Esse adatador acessa as
 * características do objeto a ser adaptado através de um instância
 * interna. Além disso também deve implementar a interface do nosso adapter.
 * Para realizar a adaptação criamos um método adicional para converter a voltagem.
 */

public class SocketObjectAdapter implements SocketAdapter{

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVoltage();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVoltage();
        return convertVoltage(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVoltage();
        return convertVoltage(v, 40);
    }

    private Volt convertVoltage(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
