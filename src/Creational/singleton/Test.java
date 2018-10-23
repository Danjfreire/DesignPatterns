package Creational.singleton;

public class Test {

    public static void main(String[]args){
        System.out.println("Eager Singleton");
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("Hash1 :" + eager1.hashCode());
        System.out.println("Hash2 :" + eager2.hashCode());

        System.out.println("------------------------------");

        System.out.println("Lazy Singleton");
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("Hash1 :" + lazy1.hashCode());
        System.out.println("Hash2 :" + lazy2.hashCode());

        System.out.println("------------------------------");

        System.out.println("Bill Pugh Singleton");

        BillPughSingleton bill1 = BillPughSingleton.getInstance();
        BillPughSingleton bill2 = BillPughSingleton.getInstance();
        System.out.println("Hash1 :" + bill1.hashCode());
        System.out.println("Hash2 :" + bill2.hashCode());

        System.out.println("------------------------------");

        System.out.println("Enum Singleton");

        EnumSingleton enum1 = EnumSingleton.INSTANCE;
        EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println("Hash1 :" + enum1.hashCode());
        System.out.println("Hash2 :" + enum2.hashCode());
    }
}
