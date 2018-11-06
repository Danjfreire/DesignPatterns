package Behavioral.TemplateMethod;

public class Test {

    public static void main(String[]args){

        HouseTemplate house1 = new WoodenHouse();
        house1.buildHouse();

        System.out.println("-------------------------------");

        HouseTemplate house2 = new GlassHouse();
        house2.buildHouse();
    }

}
