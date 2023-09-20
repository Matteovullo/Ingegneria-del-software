package esercizio_adapter;

public class Client {
    public static void main(String[] arg){
        Target t=new Stringjava();
        System.out.println(t.equal("cio", "ciao"));       
        System.out.println(t.substring("cio", 1, 2));
        System.out.println(t.indexOf("cio", "ciao", 1));
        System.out.println(t.isEmpty("cio"));
        System.out.println(t.charAt("cio", 1));
        String s="Ciao";
        t.toLowerCase(s);
        System.out.println(s);
        t.toUpperCase(s);
        System.out.println(s);
        System.out.println(t.charAt("cio"));
        System.out.println(t.toString(12));
        System.out.println(t.lastIndexOf("cio", "ciao"));         
    }
}
