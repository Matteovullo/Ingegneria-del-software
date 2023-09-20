import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YourClassName {
    public static class Persona {
        private String name;
        private int age;
        private String role;

        public Persona(String name, int age, String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }

        String getRole(){return role;}
        String getName(){return name;}
        int getAge(){return age;}

        // Getters and setters (if needed)
    }

    public static class Prodotto{
        String nome;
        double prezzo;

        public Prodotto(String _nome, double _prezzo){
            nome=_nome;
            prezzo=_prezzo;
        }

        double getPrezzo(){return prezzo;}
        String getString(){return nome;}
    }

    public static class Commento {
        private String testo;
        private LocalDate data;

        public Commento(String testo, LocalDate data) {
            this.testo = testo;
            this.data = data;
        }

        public String getTesto() {
            return testo;
        }

        public LocalDate getData() {
            return data;
        }
    }

    public static class Utente {
        private String nome;
        private List<Commento> commenti;

        public Utente(String nome, List<Commento> commenti) {
            this.nome = nome;
            this.commenti = commenti;
        }

        public String getNome() {
            return nome;
        }

        public List<Commento> getCommenti() {
            return commenti;
        }
    }

    public static void main(String[] args) {
        List<Persona> l = List.of(
            new Persona("Kent", 29, "CTO"),
            new Persona("Luigi", 25, "Programmer"),
            new Persona("Andrea", 26, "GrLeader"),
            new Persona("Sofia", 26, "Programmer"),
            new Persona("Alfio", 63, "Programmer")
        );

        /* Data una lista di persone, trovare i nomi dei programmatori 
        con età minore di 30 anni.*/
        l.stream()
        .filter(d->d.getAge()<30)
        .filter(d->d.getRole().equals("Programmer"))
        .forEach(d->System.out.println(d.getName()+" "));
        
        /*Data una lista di istanze di Persona trovare i diversi ruoli.*/
        l.stream()
        .map(d->d.getRole())
        .distinct()
        .forEach(d->System.out.println(d+" "));

        /*Data una lista di stringhe, produrre una lista che contiene 
        solo le 
        stringhe che cominciano con un certo prefisso noto. */
        List<String> l2 = List.of("author", "auto",
                           "autocorrect", "begin",
                           "big", "bigger", "biggish");

        String prefisso="a";

        List<String> s=l2.stream()   
        .filter(p->p.startsWith(prefisso))
        .collect(Collectors.toList());

        System.out.println(s);

        /*Data una lista di stringhe, produrre una stringa 
        contenente le iniziali di ciascuna stringa della lista. */
        List<String> l3 = List.of("to", "speak", "the", "truth",
                           "and", "pay", "your", "debts");
                        
        String initials = l3.stream()
                .map(str -> String.valueOf(str.charAt(0))) // Ottieni la prima lettera di ogni stringa
                .collect(Collectors.joining()); 

        System.out.println(initials);

        /*Data una lista di terne di numeri interi, per ciascuna terna 
        verificare se essa costituisce un triangolo. Restituire la lista 
        dei perimetri per le terne che rappresentano triangoli.
        In un triangolo, ciascun lato è minore della somma degli altri 
        due.
        Si può rappresentare la terna come un array di tre elementi 
        interi*/

        List<List<Integer>> l7= List.of(List.of(3, 4, 5), List.of(3, 4, 6),
                List.of(3, 4, 7), List.of(3, 4, 8));

        private static int calculatePerimeter(Triplet triplet) {
        int a = triplet.a();
        int b = triplet.b();
        int c = triplet.c();

        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        } else {
            return 0;
        }
    }        

        List<Integer> perimeters = triplets.stream()
                .map(TrianglePerimeters::calculatePerimeter)
                .filter(perimeter -> perimeter > 0)
                .toList();

        System.out.println(perimeters);



        /*Data una lista di numeri interi positivi, verificare se la lista è ordinata.
        Suggerimenti:
        Si generano gli indici da 0 a n-1
        Per ciascun valore dell'indice i, si confrontano l'elemento con 
        indice i ed il successivo, se il secondo è minore del primo la lista 
        non è ordinata e si può fermare la verifica*/

        List<Integer> numbers=List.of(1, 10, 3, 4, 5);

        boolean isOrdered = IntStream.range(0, numbers.size() - 1)
                .allMatch(i -> numbers.get(i + 1) >= numbers.get(i));

        if (isOrdered) {
            System.out.println("La lista è ordinata.");
        } else {
            System.out.println("La lista non è ordinata.");
        }

        /*Data una lista di prodotti, restituire il costo totale dei prodotti 
        che hanno un prezzo maggiore di 10*/

        List<Prodotto> l6 = List.of(new Prodotto("p1", 5.0), new Prodotto("p2", 10.0),
                             new Prodotto("p3", 15.0), new Prodotto("p4", 20.0));

        double costo_totale=l6.stream()
        .filter(p->p.getPrezzo()>10)
        .map(p->p.getPrezzo())
        .reduce(0.0, Double::sum);

        System.out.println(costo_totale);

        /*Produrre una lista contenente i primi n multipli di 7. */
        int n=10;
        List<Integer> multipli=IntStream.rangeClosed(1, n)
        .map(x->x*7)
        .boxed()
        .collect(Collectors.toList());

        System.out.println(multipli);

        /*Data una lista di utenti, restituire tutti i loro commenti ordinati 
        per data. */
        
        List<Utente> l9 = List.of(
          new Utente("u1",
                  List.of(new Commento("c2", LocalDate.of(2021, 1, 2)),
                          new Commento("c1", LocalDate.of(2021, 1, 1)),
                          new Commento("c5", LocalDate.of(2021, 1, 5)))),
          new Utente("u2",
                  List.of(new Commento("c4", LocalDate.of(2021, 1, 4)),
                          new Commento("c3", LocalDate.of(2021, 1, 3)))));

        List<String> sortedComments = l9.stream()
                .flatMap(user -> user.getCommenti().stream())
                .sorted(Comparator.comparing(Commento::getData))
                .map(Commento::getTesto)
                .toList();

        System.out.println(sortedComments);

    List<Prodotto> l = List.of(new Prodotto("p1", 80), new Prodotto("p2", 50),
        new Prodotto("p3", 10), new Prodotto("p4", 20));
    }
}
