package esercizio_singleton;

public class Client2 {
    public static void main(String[] arg){
        LibreriaSingleton ls=LibreriaSingleton.getInstance();
        Scaffale s=new Scaffale();
        ls.addScaffale(s);

        LibreriaSingleton ls2=LibreriaSingleton.getInstance();
        ls2.addScaffale(s);
    }
}
