public class MainTeam {

    public static void main(String[] args){
        ListaPersone persone = new ListaPersone();

        persone.genListaPagamenti();
        int somma = persone.stampaCalcolaSomma();
        System.out.println("Totale:\t" + somma);

        persone.stampaRuoliPersone();
        System.out.println();
    }
    
}
