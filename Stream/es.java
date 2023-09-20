import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class es {
    /*1.	 Usando la programmazione funzionale di Java, data una lista 
    t di istanze di Triang, 	implementare una classe con:
(a) un metodo che restituisce le istanze della lista t che sono 
triangoli (suggerimento: verificare che la somma degli angoli sia 180).
(b) un metodo che restituisce le istanze di Triang che sono triangoli 
rettangoli (suggerimento: un angolo è 90 e la somma degli angoli è 180),
(c) un metodo che restituisce il valore maggiore dei perimetri delle 
istanze di t,
(d) un metodo che restituisce la somma dei perimetri delle istanze di t.

public record Triang(int latol, int lato2, int lato3, int angolol, int angolo2, int angolo3) {
}
 */
public static void main(String[] arg){
    List<Triangolo> l19 = List.of(new Triangolo(3, 4, 5, 30, 60, 90),
                                new Triangolo(4, 5, 4, 30, 30, 120),
                                new Triangolo(13, 5, 12, 30, 60, 90),
                                new Triangolo(17, 15, 8, 30, 70, 90));

        List<Triangolo> tr=l19.stream()
        .filter(t->t.a1()+t.a2()+t.a3()==180)
        .collect(Collectors.toList());

        //System.out.println(tr);

        List<Triangolo> tr2=l19.stream()
        .filter(t->t.a1()+t.a2()+t.a3()==180)
        .filter(t->t.a1()==90 || t.a2()==90 || t.a3()==90)
        .collect(Collectors.toList());

        System.out.println(tr2);

        List<Integer> perimetri=l19.stream()
        .map(t->t.l1()+t.l2()+t.l3())
        .collect(Collectors.toList());

        Optional<Integer> o=perimetri.stream()
        .max(Integer::compare);

        if(o.isPresent()) System.out.println(o.get());

        int somma=perimetri.stream()
        .reduce(0, Integer::sum);

        System.out.println(somma);


        /*1. 	Usando la programmazione funzionale di Java, data una lista 
        f di istanze di Figura, 	implementare 	una classe con:
(a) un metodo che restituisce le istanze f che sono quadreti o rettangoli 
(suggerimentose i quattro angoli sono uguali).
(b) un metodo che restituisce una lista contetente il valore del lato più 
piccolo di ciascuna istanza in f
(c) un metodo che restituisce il valore minore dei perimetri delle istanze in f,
(d) un metodo che restituisce la somma dei perimetri delle istanze in f.



public record Figura(int latol, int lato2, int lato3, int lato4, int angolol, int angolo2, int angolo3, int angolo4) {
}
 */

    List<Figura> f = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));

                    
    List<Figura> fg=f.stream()
    .filter(r->r.a1()==r.a2() && r.a1()==r.a3() && r.a2()==r.a3())
    .collect(Collectors.toList());

    System.out.println(fg);

    /*(b) un metodo che restituisce una lista contetente il valore del lato più 
piccolo di ciascuna istanza in f */
    List<Integer> minimo=f.stream()
    .map(t->Stream.of(t.l1(), t.l2(), t.l3(), t.l4())
                    .min(Integer::compare)
                    .get())
    .collect(Collectors.toList());

    System.out.println(minimo);


    int per=f.stream()
    .map(t->t.l1()+t.l2()+t.l3()+t.l4())
    .min(Integer::compare)
    .get();

    System.out.println(per);

    int sommap=f.stream()
    .map(t->t.l1()+t.l2()+t.l3()+t.l4())
    .reduce(0, Integer::sum);

    System.out.println(sommap);



    

} 
}
