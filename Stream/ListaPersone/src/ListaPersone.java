import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListaPersone{
    private List <Persona> pe = Arrays.asList(new Persona("Saro" , 24),new Persona("Taro",21),
    new Persona("Ian",19), new Persona ("Al",16));

    public void estraiEtaPersone(){
        List <Integer> e = pe.stream()
        // map() prende in ingresso una funzione mapper (getEta) e
        // restituisce uno st ream contenete i risultati dell'esecuzione
        // della funzione
            .map(x -> x.getEta())
         /* collect() permette di raggruppare risultati e prende in ingresso
         * un collector.
         * La classe COLLECTORS implementa metodi per raggruppamenti
         * toList() reestituisce un COLLECTOR che accumula elementi in List
         * */
            .collect(Collectors.toList());
        System.out.println("Estrai eta: " + e);
    }

    public void sommaEtaPersone(){
        int s = pe.stream()
            /* map() eseuguito su una istanza BustaPaga restituisce
             * i valori in uscita di getEta
             */
            .map(Persona::getEta)
            /*reduce() accumula ciascun valore dello stream, rappresentato da "t"
             * somma calcolata per ciascun "t" viene accumulata in v
             */
            .reduce(0, (v,t) -> v+t);
        System.out.println("somma eta: " + s);
    }

    public void trovaPersona(){
        Comparator<Persona> c = Comparator.comparing(x -> x.getEta());
        //Optional<> rappresenta un valore che può esistere o meno
        // se esiste il metodo isPresent() darò un valore true
        Optional <Persona> pmax = pe.stream()
            /* filter() è usata per separare gli elementida quelli
             * la condizione x.giovane() 
             */
            .filter(x -> x.giovane())
            // max() trova il valore massimo al suo interno
            .max(c);
        if (pmax.isPresent()) System.out.println("trova persona : " +
        pmax.get().getNome());
    }

    public void trovaPersonaImper(){
        Persona pmax = null;
        for(Persona x : pe)
            if(x.getEta() < 26){
                if(pmax == null) pmax = x;
                if(pmax.getEta() < x.getEta()) pmax = x;
            }
        if (pmax != null) System.out.println("persona: " + pmax.getNome());
    }


}