package esercizio_adapter;

public class Stringjava implements Target{
    private Stringcplusplus scpp=new Stringcplusplus();
    public boolean equal(String s1, String s2){
        return scpp.compare(s1, s2);
    }

    public String substring(String s1, int i, int j){
        return scpp.substr(s1, i, j);
    }

    public int indexOf(String s1, String s2, int i){
        return scpp.find(s1, s2, i);
    }

    public boolean isEmpty(String s1){
        return scpp.empty(s1);
    }

    public char charAt(String c1, int i){
        return scpp.at(c1, i);
    }

    public void toLowerCase(String s1){
        scpp.tolower(s1);
    }

    public void toUpperCase(String s1){
        scpp.toupper(s1);
    }

    public char charAt(String s1){
        return scpp.front(s1);
    }

    public String toString(int i){
        return scpp.to_string(i);
    }

    public int lastIndexOf(String s1, String s2){
        return scpp.find_last_of(s1, s2);
    }
}
