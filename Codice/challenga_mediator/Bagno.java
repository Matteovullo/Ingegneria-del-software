public class Bagno implements Colleague{
    private int i=0;
    public void open(){
        i=1;
        System.out.println("Bagno aperto!");
    }
    public void close(){
        i=0;
        System.out.println("Bagno chiuso!");
    }
    public void state(){
        if(i==0)
            System.out.println("Il bagno è chiuso!");
        else{
            System.out.println("Il bagno è aperto!");
        }
    }
}
