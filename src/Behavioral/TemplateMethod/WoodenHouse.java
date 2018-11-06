package Behavioral.TemplateMethod;

public class WoodenHouse extends HouseTemplate{

    @Override
    public void buildWalls() {
        System.out.println("Construindo paredes de madeira");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construindo pilares com revestimento de madeira");
    }
}
