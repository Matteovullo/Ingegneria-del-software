package esercizio_adapter;

public class Stringcplusplus {
    public boolean compare(String s1, String s2){
        return s1.equals(s2);
    }

    public String substr(String s1, int i, int j){
        return s1.substring(i, j);
    }

    public int find(String s1, String s2, int i){
        return s1.indexOf(s2, 0);
    }

    public boolean empty(String s1){
        return s1.isEmpty();
    }

    public char at(String s1, int i){
        return s1.charAt(i);
    }

    public void toupper(String s1){
        s1.toUpperCase();
    }

    public void tolower(String s1){
        s1.toLowerCase();
    }

    public char front(String s1){
        return s1.charAt(0);
    }

    public String to_string(int i){
        return Integer.toString(i);
    }

    public int find_last_of(String s1, String s2){
        return s1.lastIndexOf(s2);
    }

    public int compare(String s1, String s2, int i){
        return s1.compareTo(s2);
    }
}
