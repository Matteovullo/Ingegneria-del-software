package challeng_abstract;

public class Mare implements Tipo{
    public void getTipologia(int j){
        if(j<=5)
        System.out.println("Piatto di mare");
        else
        System.out.println("Non è un piatto di mare");
    }
}
