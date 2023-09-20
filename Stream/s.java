import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class s {
    public static void main(String[] arg){

    /*Data una lista di numeri interi positivi, verificare se la lista è ordinata.
    Suggerimenti:

    Si generano gli indici da 0 a n-1
    Per ciascun valore dell'indice i, si confrontano l'elemento con 
    indice i ed il successivo, se il secondo è minore del primo la lista 
    non è ordinata e si può fermare la verifica */

    /*
    List<Integer> ln=List.of(1, 2, 3, 4, 5);
    
    l.stream()
    .iterate(0, x->x+1)
    .limit(ln.size())
    .map(n->n.get(x))
    */


        List<Prodotto> l1 = List.of(new Prodotto("p1", 80), new Prodotto("p2", 50),
                           new Prodotto("p3", 10), new Prodotto("p4", 20));

        /*Restituire il prodotto più economico */
        Optional<String> pr=l1.stream()
        .min(Comparator.comparing(Prodotto::prezzo))
        .map(p->p.nome());

        System.out.println(pr.get());

        List<Figura> l2 = List.of(new Figura(12, 12, 12, 12, 45, 45, 135, 135),
                         new Figura(2, 2, 2, 2, 90, 90, 90, 90),
                         new Figura(1, 2, 1, 2, 90, 90, 90, 90));

        /*Restituire tutte le figure che siano rettangoli o quadrati (tutti gli angoli uguali)*/
        List<Figura> f=l2.stream()
        .filter(a->a.a1()==a.a2())
        .filter(a->a.a1()==a.a3())
        .filter(a->a.a1()==a.a4())
        .filter(a->a.a2()==a.a3())
        .filter(a->a.a2()==a.a4())
        .filter(a->a.a3()==a.a4())
        .collect(Collectors.toList());

        System.out.println(f);

        /*Restituire uno stream che contenga il lato minore per ogni figura */

        /*Restituire il perimetro minore tra tutte le figure */
        List<Integer> perimetro=l2.stream()
        .map(p->p.l1()+p.l2()+p.l3()+p.l4())
        .collect(Collectors.toList());

        System.out.println(perimetro);

        Optional<Integer> o2=perimetro.stream()
        .min(Comparator.naturalOrder());

        System.out.println(o2.get());

        /*Ottenere la somma del valore dell'area di tutte le figure*/
        /* 
        Stream<Integer> prettangolo=l2.stream()
        .filter(p->p.l1()!=p.l2() || p.l1()!=p.l3() || p.l1()!=p.l4()
        || p.l2()!=p.l3() || p.l2()!=p.l4() || p.l3()!=p.l4())
        .map(p->(p.l1()*p.l2())\2);

        Stream<Integer> pquadrato=l2.stream()
        .filter(p->p.l1()==p.l2() || p.l1()==p.l3() || p.l1()==p.l4()
        || p.l2()==p.l3() || p.l2()==p.l4() || p.l3()==p.l4())
        .map(p->p.l1()*p.l2());

        L.Stream()
        */

        /*Restituire la somma totale dei costi dei 2 prodotti meno cari*/

        List<Prodotto> l10 = List.of(new Prodotto("p1", 80),
                                new Prodotto("p2", 40),
                                new Prodotto("p3", 10),
                                new Prodotto("p4", 90)); 

        Optional<Prodotto> min1=l10.stream()
        .min(Comparator.comparing(Prodotto::prezzo));

        Optional<Prodotto> min2=l10.stream()
        .min(Comparator.comparing(Prodotto::prezzo));

        

        /*Restituire la lista di lati maggiori dei triangoli.*/

        List<Triangolo> l19 = List.of(new Triangolo(3, 4, 5, 30, 60, 90),
                            new Triangolo(4, 5, 4, 30, 30, 120),
                            new Triangolo(13, 5, 12, 30, 60, 90),
                            new Triangolo(17, 15, 8, 30, 60, 90));

        List<Triangolo> l20 = List.of(new Triangolo(6, 4, 5, 30, 60, 90),
                            new Triangolo(109, 5, 4, 30, 30, 120),
                            new Triangolo(13, 5, 12, 30, 60, 90),
                            new Triangolo(17, 15, 8, 30, 60, 90));

        
        List<Integer> lati1=l19.stream()
        .map(p->p.l1())
        //.map(f->f.l2())
        //.map(f->f.l3())
        .collect(Collectors.toList());

        /*Restituire una lista di triangoli isosceli. Un triangolo è isoscele se due suoi lati sono uguali. */
        List<Triangolo> t=l19.stream()
        .filter(p->p.l1()==p.l2() || p.l1()==p.l3() || p.l2()==p.l3())
        .collect(Collectors.toList());

        System.out.println(t);


        List<Integer> li=l19.stream().map(l->l.a1()).collect(Collectors.toList());

                List<Triangolo> triangoliConLato1Uguale = l19.stream()
                .filter(triangolo -> triangolo.l1() == l20.get(0).l1())
                .collect(Collectors.toList());

                System.out.println(triangoliConLato1Uguale);


    }
}
