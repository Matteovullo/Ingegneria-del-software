package challeng_adapter;

public class Adapter implements Target{
    private Adaptee a=new Adaptee();

    public void add(int i){
        a.insert(i);
    }

    public void remove(int i){
        a.erase(i);
    }

    public int get(int i){
        return a.front(i);
    }
}
