package esercizio_singleton;

import java.util.*;
//import java.io.*;

public class Libreria {
    public List<Scaffale> libreria=new ArrayList<>();
    private int count;

    public void addScaffale(Scaffale s){
        if(count<=10){
            count++;
            libreria.add(s);
        }
    }

    public void removeScaffale(Scaffale s){
        for(int i=0; i<libreria.size(); i++){
            if(libreria.get(i).getCategoria() == s.getCategoria()){
                libreria.remove(libreria.get(i));
                return;
            }
        }
    }

}
