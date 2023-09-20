import java.util.ArrayList;
import java.util.List;

public class Composite implements Filesistem{
    private List<Filesistem> fl=new ArrayList<Filesistem>();

    public void tipo(){
        System.out.println("Carrello di filesistem");
    }

    public void add(Filesistem f){
        fl.add(f);
    }

    public void remove(Filesistem f){
        fl.remove(f);
    }
}
