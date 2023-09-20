import java.util.ArrayList;
import java.util.List;

public class Messaggio {
    private List<Observed> obs=new ArrayList<Observed>();
    private boolean change=false;

    public void notify(Object state){
        if(!change) return;
        else{
            for(Observed o: obs){
                o.update(this, state);
            }
            change=false;
        }
    }

    public void setChange(){
        change=true;
    }

    public boolean state(){
        return change;
    }

    public void attach(Observed o){
        obs.add(o);
    }

    public void deattach(Observed o){
        obs.remove(o);
    }

}
