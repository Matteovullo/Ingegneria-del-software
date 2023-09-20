package challeng_abstract;

public class Montagna implements Tipo{
    public void getTipologia(int j){
        if(j>=5)
        System.out.println("Piatto di montagna");
        else
        System.out.println("Non è un piatto di montagna");
    }
}
