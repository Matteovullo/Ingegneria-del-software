public class Cucina implements Colleague{
    private int i=0;

    public void open(){
        i=0;
        System.out.println("Cucina aperta!");
    }
    public void close(){
        i=1;
        System.out.println("Cucina chiusa!");
    }
    public void state(){
        if(i==0)
            System.out.println("La cucina è aperta!");
        else{
            System.out.println("La cucina è chiusa!");
        }
    }
}
