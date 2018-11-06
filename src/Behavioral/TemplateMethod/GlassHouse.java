package Behavioral.TemplateMethod;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Construindo paredes de vidro");
    }

    @Override
    public void buildPillars() {
        System.out.println("Construindo pilares com revestimento de vidro");
    }
}
