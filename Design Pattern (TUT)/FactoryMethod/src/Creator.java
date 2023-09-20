import java.util.Set;
import java.util.TreeSet;

public abstract class Creator {

    public static final int MAXPOSTI = 100;
    private final Set <String> pst = new TreeSet<>();

    public Product prendiNumero(int x){
        if(pst.size() == MAXPOSTI) return null;

        Product p; 

        do{
            p = getPosto(x);
        } while (pst.contains(p.getPosizione()));

        pst.add(p.getPosizione());
        return p;
    }

    public void printPostiOccupati(){
        for (String s : pst)
            System.out.print(s + " ");
    }

    public abstract Product getPosto(int tipo);
    
}
