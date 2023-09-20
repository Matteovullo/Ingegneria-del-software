package challeng_adapter;

import java.util.*;

public class Adaptee {
    ArrayList<Integer> myList = new ArrayList<Integer>();

    public void insert(int i){
        myList.add(i);
    }

    public void erase(int i){
        myList.remove(i);
    }

    public int front(int i){
        return myList.get(i);
    }
}
