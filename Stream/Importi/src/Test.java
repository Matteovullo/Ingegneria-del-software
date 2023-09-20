public class Test {
    public static void main (String[] args){
        Importi imp = new Importi();
        int somma = imp.calcolaSomma();
        System.out.println("Somma " + somma);
        if ( somma == imp.calcolaSommaImper()) 
            System.out.println("OK somma");

        int max = imp.estraiMassimo();
        System.out.println("Massimo: " + max);
        System.out.println("Valori estratti: "
        + imp.estraiValori(67) + "\n");
        System.out.println("In stringa :" + imp.congiungi()
        + "\n");
    }
    
}
