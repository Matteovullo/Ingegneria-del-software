//Subject

// SUBJECT conosce i suoi "osservatori", e tanti observer possoo osservare una
// SUBJECT. Implementa le operazioni per aggiungere e togliere oggetti OBSERVER
// SUBJECT conosce solo la classe Observer 

import java.util.ArrayList;
import java.util.List;

public class Edificio{

    private List<Spia> spie = new ArrayList<>();

    public void inviaSpia(Spia s){ // Attach

        if(!spie.contains(s)) spie.add(s);
    }

    public void ritiraSpia(Spia s){ // Detach
        if(spie.contains(s)) spie.remove(s);
        System.out.println("Spia scoperta! .. Rimossa: ");

    }

    public void avvertiSpia(){ //Notify
        for(Spia h : spie){
            h.nuovoEroe();
        }
    }
}