public class Main {
    
    public static void main(String [] args) {

        Drawable triangle = new Triangle();
        Drawable quadrato = new Quadrato();

        DrawingComposite obj = new DrawingComposite();
        obj.add(triangle);
        obj.add(quadrato);

        DrawingComposite obj2 = new DrawingComposite();
        obj2.add(triangle);
        obj.add(obj2);

        obj.draw();

    }

}
