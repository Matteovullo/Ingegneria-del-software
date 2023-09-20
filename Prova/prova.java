import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class prova{

    public record Utente(String nome, List<Commento> commenti) {
    }

    public record Commento(String testo, LocalDate data) {
    }

    
    public record Triangolo (int l1, int l2, int l3) {   }
    public static void main(String[] arg){
            List<Utente> l = List.of(
                    new Utente("u1",
                    List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                    new Commento("c1", LocalDate.of(2021, 1, 1)),
                    new Commento("c5", LocalDate.of(2021, 1, 5)))),
                    new Utente("u2",
                    List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                    new Commento("c3", LocalDate.of(2021, 1, 3)))));
                    
                    
                    List<Integer> l2=List.of(1, 2, 3, 4, 5);
                    
                    
                    /*Predicate<Integer> p=l2.stream().
                    Intstream().range(0, l.size())
                    .filter(n->n.get(n) < n.get(n+1))
                    .findAny()
                    .isPresent();*/
                List<Triangolo > w = List.of(new Triangolo(4,5,6));
                    
         w.stream().map(x -> List.of(x.l1, x.l2, x.l3))
                   .map(a ->a.stream().sorted(Comparator.naturalOrder()).limit(2).toList());
    }
}