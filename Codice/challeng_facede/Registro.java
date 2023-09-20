package challeng_facede;

import java.util.*;

public class Registro {
    private List<Pagamento> registro=new ArrayList<>();

    public void addPagamento(Pagamento p){
        registro.add(p);
    }

    public void searchPagamento(Pagamento p){
        for(int i=0; i<registro.size(); i++){
            if(registro.get(i).getID() == p.getID()){
                System.out.println("Trovato!"+registro.get(i).getID());
            }
        }
    }
}
