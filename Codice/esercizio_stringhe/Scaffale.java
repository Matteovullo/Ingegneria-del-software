package esercizio_stringhe;

import java.util.*;
//import java.io.*;

public class Scaffale {
    public List<Libro> scaffale=new ArrayList<>();
    private int categoria;
    private int count;

    public int getCategoria(){return categoria;}

    public void addLibro(Libro l){
        if(!scaffale.contains(l) && count<=10){
            scaffale.add(l);
            count++;
        }
    }

    public void removeLibro(Libro l){
        for(int i=0; i<scaffale.size(); i++){
            if(scaffale.get(i).getID() == l.getID()){
                scaffale.remove(scaffale.get(i));
                return;
            }
        }
    } 

    public void sconto(double x){
        for(Libro l : scaffale){
            l.sconto(x);
        }
    }
}
