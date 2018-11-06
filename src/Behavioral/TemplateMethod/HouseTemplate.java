package Behavioral.TemplateMethod;

/**
 * Essa classe representa um template para construção de uma casa considerando
 * que toda casa precisa de uma fundação, pilares, paredes e janelas. Essa classe
 * define a ordem em que a casa deve ser construída, além disso provém métodos
 * padrões para a construção da casa. O método padrão deve ser criado caso seja
 * constante em qualquer implementação do template, neste caso toda casa terá
 * uma janela de vidro e fundações de cimento, ferro e areia.
 */

public abstract class HouseTemplate {

    //Método template, é declarado final para não ser sobrescrito
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("A casa foi construída");
    }

    //Métodopadrão para construção de janela
    private void buildWindows() {
        System.out.println("Construindo janela de vidro");
    }

    private void buildFoundation() {
        System.out.println("Construindo fundação com cimento, ferro e areia");
    }


    //Métodos a serem implementados por subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

}
