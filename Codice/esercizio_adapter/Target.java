package esercizio_adapter;

public interface Target {
    public boolean equal(String s1, String s2);
    public String substring(String s1, int i ,int j);
    public int indexOf(String s1, String s2, int i);
    public boolean isEmpty(String s1);
    public char charAt(String c1, int i);
    public void toLowerCase(String s1);
    public void toUpperCase(String s1);
    public char charAt(String s1);
    public String toString(int i);
    public int lastIndexOf(String s1, String s2);
}
