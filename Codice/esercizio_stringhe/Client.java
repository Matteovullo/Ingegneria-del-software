package esercizio_stringhe;

public class Client {
    public static void main(String arg[]){
        Libro l1=new Libro("Ingengeria del sofware", 20.50, 5, "Uni", "ING20");
        Libro l2=new Libro("Ingengeria del popito", 35.50, 2, "Popito", "ING35");
        Scaffale sc = new Scaffale();
        Libreria lb = new Libreria();
        sc.addLibro(l1);
        sc.addLibro(l2);
        sc.removeLibro(l2);
        lb.addScaffale(sc);
        lb.removeScaffale(sc);

        TestScaffale ts = new TestScaffale();
        TestLibreria tl = new TestLibreria();
        ts.testAdd(l2);
        ts.testRemove(l1);
        
        tl.Testadd(sc);
        tl.Testremove(sc);
        ts.testSconto(20);
    }
}
