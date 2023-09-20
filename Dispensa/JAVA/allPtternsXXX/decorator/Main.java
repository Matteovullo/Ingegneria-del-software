public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("CERCHIO CON BORDO NORMALE");
        circle.draw();

        System.out.println("\nCERCHIO CON BORDO ROSSO");
        redCircle.draw();

        System.out.println("\nRETTANGOLO CON BORDO ROSSO");
        redRectangle.draw();


    }
    
}
