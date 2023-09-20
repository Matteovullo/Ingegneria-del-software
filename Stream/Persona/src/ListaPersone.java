import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaPersone {
    // prende parametro persona
    private List < Persona > team = List.of(new Persona("Kent Gray", 29, "CTO"),
    new Persona("Luigi Rossi", 25, "Programmer"),
    new Persona("Al White", 25, "Programmer"),
    new Persona("Andrea Verdi", 26, "GroupLeader"),
    new Persona("Joe Black", 26, "Programmer"),
    new Persona("Jill Purple", 26, "Tester"),
    new Persona("Bill Green", 26, "Analyst"),
    new Persona("Luc Brown", 26, "Tester"));

// una lista che prende parametro string e intero
private Map < String, Integer > roleCost = Map.of("Programmer", 50,
"GroupLeader", 60, "CTO",65, "Tester",56,"Analyst",54);

private List < BustaPaga > pagamenti;

// per le persone del team calcola l'ammontare da pagare
public void genListaPagamenti(){
    pagamenti = team.stream()
    // getOrDefault(key,defaultValue) : key e' il valore mappato da ritornare
    // defaultValue e' il valore nel caso in cui il valore mappato nella chiave non è trovato
        .map(pers -> new BustaPaga(pers, roleCost.getOrDefault(pers.getRuolo(),50)))
        .map(busta -> busta.calcolaCostoBase())
        .map(busta -> busta.aggiungiBonus())
        // sorted() restituisce elementi dello stream in ordine naturale.
        .sorted()
        .collect(Collectors.toList());
        
}

//calcola tot. pagamenti e stampa nome persona del team e costo

public int stampaCalcolaSomma(){
    return pagamenti.stream()
        //map() Eseguito su una istanza BustaPaga
        // restituisce i valori in uscita da stampa
        .map(BustaPaga::stampa)
        // mapToInt() esegue la funzione passata e restitusice un IntStream
        .mapToInt(BustaPaga::getCosto)
        // sum() somma i valori presenti nello stream IntStream
        .sum();
}

//stampa ciascun ruolo e l'elenco delle persone in quel ruolo

public void stampaRuoliPersone(){
    roleCost.keySet()
        .stream()
        .sorted()
        .peek(role -> System.out.print("\n" + role+": "))
        //forEach() esegue un'azione su ciascun elemento dello stream
        .forEach(role -> team.stream()
            // filter() restituisce gli elementi che soddisfano il
            // predicato passato
            .filter(pers -> pers.getRuolo().equals(role))
            // sorted() restituisce uno straem che ha gli elementi ordinati
            // in base al comparator passato
            .sorted(Comparator.comparing(Persona::getNome))
            //forEach() esegue un'azione su ciascun elemento dello stream
            .forEach(pers -> System.out.print(pers.getNome() + ", ")));
}

}



