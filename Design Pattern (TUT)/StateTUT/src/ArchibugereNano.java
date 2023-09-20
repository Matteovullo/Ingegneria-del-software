//Context
public class ArchibugereNano{

    private Postura p;

    public ArchibugereNano(){
        p = new InPiedi();
    }

    public void spara(){
        p.fuoco();
    }

    public void insultaElfo(){
        p.impreca();
    }


    public void alza(){

        switch(p.getName()){
            case "InPiedi":{
                p = new Salto();
                System.out.println("1a , -> Salto()");
                break;
            }
            case "Accovacciato":{
                p = new InPiedi();
                System.out.println("2a , -> InPiedi()");
                break;
            }

            case "Sdraiato":{
                p = new Accovacciato();
                System.out.println("3a , -> Accovacciato()");
                break;
            }

            case "Salto":{
                System.out.println("Il nano ha saltato troppo e si è sfracellato al suolo");

                p = new Sdraiato();
                System.out.println("4a , -> Sdraiato()");
                break;
            }
        }
    }

    public void abbassa(){
        switch(p.getName()){

            case "InPiedi":{
                p = new Accovacciato();
                System.out.println("1b , -> Accovacciat()");
                break;
            }

            case "Accovacciato":{
                p = new Sdraiato();
                System.out.println("2b , -> Sdraiato()");
                break;
            }

            case "Sdraiato":{
                System.out.println("Non puoi abbassarti mentre sei accovacciato");
                System.out.println("3b - > null");
                break;
            }

            case "Salto":{
                p = new Salto();
                System.out.println("4b , -> Salto()");
                break;
            }
        }
    }
}