package Structural.Adapter;

public class Test {

    public static void main(String[]args){

        System.out.println("Class adapter");
        SocketAdapter classAdapter = new SocketClassAdapter();
        System.out.println("120v : " + classAdapter.get120Volt().getVolts());
        System.out.println("12v : " + classAdapter.get12Volt().getVolts());
        System.out.println("3v : " + classAdapter.get3Volt().getVolts());

        System.out.println("------------------------------");

        System.out.println("Object adapter");
        SocketAdapter objectAdapter = new SocketObjectAdapter();
        System.out.println("120v : " + objectAdapter.get120Volt().getVolts());
        System.out.println("12v : " + objectAdapter.get12Volt().getVolts());
        System.out.println("3v : " + objectAdapter.get3Volt().getVolts());
    }

}
