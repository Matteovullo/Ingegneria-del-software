package esercizio_singleton;

public class TestScaffale {
    private Scaffale sc=new Scaffale();

    public void testAdd(Libro l){
        sc.addLibro(l);
        for(Libro li : sc.scaffale){
            if(li.getID() == l.getID()) {
                System.out.println("Test add superato");
                return;
            }
        }
        System.out.println("Test add non superato");
    }

    public void testRemove(Libro l){
        sc.removeLibro(l);
        for(Libro li : sc.scaffale){
            if(li.getID() == l.getID())  System.out.println("Test remove non superato");
        }
        System.out.println("Test remove superato");
    }

    public void testSconto(double x){
        for(Libro li : sc.scaffale){
            double d=li.getPrezzo();
            li.sconto(x);
            if(d!=li.getPrezzo()){
                System.out.println("Test sconto superato");
                return;
            }
        }
        System.out.println("Test sconto non superato");
    }
    
}
