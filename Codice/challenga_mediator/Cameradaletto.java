public class Cameradaletto implements Colleague{
    private int i=0;
    public void open(){
        i=1;
        System.out.println("Camera da letto aperta!");
    }
    public void close(){
        i=0;
        System.out.println("Camera da letto chiusa!");
    } 
    public void state(){
        if(i==0)
            System.out.println("La camera da letto è chiuso!");
        else{
            System.out.println("La camera da letto è aperta!");
        }
    }
}
