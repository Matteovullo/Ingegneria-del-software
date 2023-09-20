package esercizio_stringhe;

public class TestLibreria {
    private Libreria lb=new Libreria();

    public void Testadd(Scaffale s){
        lb.addScaffale(s);
        for(Scaffale si : lb.libreria){
            if(si.getCategoria()==s.getCategoria()){
                System.out.println("Test add superato");
                return;
            }
        }
        System.out.println("Test add non superato");
    }

    public void Testremove(Scaffale s){
        lb.removeScaffale(s);
        for(Scaffale sc : lb.libreria){
            if(sc.getCategoria() == s.getCategoria()){
                System.out.println("Test remove non superato");
                return;
            }
        }
        System.out.println("Test remove superato");
    }

}
