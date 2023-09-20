import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Meaning INTEGER : locazione di memoria che contiene interi (positivi o negativi, e numeri non-float)
public class Importi{
    private List <Integer> importi = Arrays.asList(12,34,56,78,90,45);

    public int calcolaSomma(){
        /* stream() restituisce uno Stream<T> che è una sequenza di 
        elementi di tipo T 
         */
        return importi.stream()
            .reduce(0,(accum,v) -> accum + v);
            /* reduce() applica la funzione di accumulazione
            e ciascun valore dello stream è rappresentato
            dal parametro "v"
            La somma calcolata per ciascun "v" è tenuta dalla
            variabile accum e inizialmente vale 0
             (parametro fornito all'inizio di reduce())
             */
    }

    public int calcolaSommaImper(){
        int risultato = 0;
        for(int v : importi) risultato += v;
        return risultato;
    }

    public int estraiMassimo(){
        return importi.stream()
        /* compare() controlla l'ordinamento in una collezione di oggetti
        /* max() al suo interno chiamata sempre il metodo compare()
        /* max() trova il valore massimo 
        */
            .max(Integer::compare)
            .get();
    }
    //Questa funzione estrae i valori superiori rispetto al val dato
    public List <Integer> estraiValori(int val){
        return importi.stream()
        /* filter() è usata per separare gli elementi soddisfano la condizione
        /* di val
        /* collect() permette di raggruppare risultati e prende in ingresso
         * un collector.
         * La classe COLLECTORS implementa metodi per raggruppamenti
         * toList() reestituisce un COLLECTOR che accumula elementi in List
         */
            .filter(s -> s > val)
            .collect(Collectors.toList());
    }

    public String congiungi(){
        return importi.stream()
        /* map() prende in ingresso una funzione mapper (valueOf) e
         * restituisce uno stream contenete i risutlati dell'esecuzione
         * della funzione su ciascun elemento dello stream iniziale
         * valueOf() restitusice i dati dei parametri numerici valori 
         * dell'oggetto nativo, i parametri possono essere String etc.
         * e può ricevere massimo 2 parametri
         * concat() Concatena due Stringhe in una Stringa
         * N.B. : "" è come utilizzare 0 sulla reduce in "calcolaSomma"
         */
            .map(s -> String.valueOf(s))
            .reduce("", (con,v) -> con.concat(v));
    }
}