import java.util.List;
import java.util.ArrayList;


public class Libreria {
    private List<Scaffale> scaffali = new ArrayList<Scaffale>();

    Libreria(){}
    Libreria(ArrayList<Scaffale> scaffali){
        for(Scaffale scaffale:scaffali){
            this.scaffali.add(scaffale);
        }
    }
    public void creaScaffale(String categoria)
    {
        if(scaffali.size() >= 10) return;
        Scaffale temp = new Scaffale(categoria);
        scaffali.add(temp);
    }

    public void creaScaffale(String categoria, Libro libro)
    {
        if(scaffali.size() >= 10) return;

        Scaffale temp = new Scaffale(categoria, libro);
        scaffali.add(temp);
    }

    public void creaScaffale(String categoria, ArrayList<Libro> libri)
    {
        for(Libro libro : libri) creaScaffale(categoria, libro);
    }

    public void creaScaffale(Scaffale scaffale)
    {
        scaffali.add(scaffale);
    }

    public void rimuoviScaffale(String categoria)
    {
        for(Scaffale scaffale : scaffali)
        {
            if(scaffale.getCategoria() == categoria)
            {
                scaffali.remove(scaffale);
            }
        }
    }
    public void printAll(){
        for(Scaffale scaffale:scaffali)
        {
            scaffale.printAll();
            System.out.println("\n");
        }
    }

}
