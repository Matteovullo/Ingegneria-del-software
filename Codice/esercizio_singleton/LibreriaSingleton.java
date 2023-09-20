package esercizio_singleton;

import java.util.*;

public class LibreriaSingleton {
    private static LibreriaSingleton obj;
    public List<Scaffale> libreria;
    private int count;

    private LibreriaSingleton(){
        libreria=new ArrayList<>();
    }

    public static LibreriaSingleton getInstance(){
        if(obj==null) return obj=new LibreriaSingleton();
        else return obj;
    }

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
