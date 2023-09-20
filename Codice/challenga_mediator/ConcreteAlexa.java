import java.util.*;

public class ConcreteAlexa {
    private List<Colleague> ls=new ArrayList<Colleague>();

    public void add(Colleague c){
        ls.add(c);
    }

    public void spegnitutto(){
        for(Colleague c: ls){
            c.close();
        }
    }

    public void accenditutto(){
        for(Colleague c: ls){
            c.open();
        }
    }
}
