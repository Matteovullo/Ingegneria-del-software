import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{

    public static void main (String[] args){
        esempioMu1(); // Esempio mu1 (Funzione di ordine superiore : restituisce funzione)

        query0(); // Stampare 10 libri (usando generate)
		query1(); // Contare tutti i libri CYBERPUNK
		query2(); // Lista dei titoli dei libri CYBERPUNK o FANTASY 
		query3(); // Somma dei costi di tutti i libri
		query4(); // Somma in dollari dei costi di tutti i libri (1 EUR = 1.12 USD)
		query5(); // Stampa tutti i libri con prezzo compreso tra 10â‚¬ e 15â‚¬
		query6(); // Titolo del Libro meno caro (ma a partire da 12â‚¬)
		query7(); // Stampa la lista dei libri ordinati per prezzo
		
		query8(); // Stampa il conteggio vendite per ogni libro (senza groupingBy)
    	query9(); // Stampa i libri raggruppati per categoria (senza groupingBy)
		
		query10(); // Creare una lista di libri fantasy da "Harry Potter 1" a "Harry Potter 7", tutti da 15 euro 
		query11(); // Sfruttando il metodo precedente, ottenere la lista di libri e mescolarla in ordine casuale
		query12(); // Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Pura)
		query13(); // Data una lista di libri, stampare il primo che ha un prezzo maggiore del precedente (Funzione Non Pura)
		query14(); // Data una lista di libri, applicare ad ogni libro uno sconto che dipende dalla categoria
        query15();

    }

    private static void esempioMu1(){
        Function<Integer,Integer> mu12 = getMu1(2);
        Function<Integer,Integer> mu13 = getMu1(3);

        System.out.println(mu12.apply(10));
        System.out.println(mu13.apply(100));
    }

    private static Function <Integer,Integer> getMu1(int p){
        return (x -> x * p);
    }

    //Stampare 10 libri

    public static void query0(){
        System.out.println("# Query 0");

        Stream.generate(Libro::gen)
            .limit(10)
            .forEach(System.out::println);
    }

    //Contare tutti i libri CYBERPUNK 
    public static void query1(){
        System.out.println("\n Query 1");
        long cnt = Stream.generate(Libro::gen)
                        .limit(10)
                        .filter(x -> x.getCategoria() == Categoria.CYBERPUNK)
                        //.peek() usato per ritirare o fare la fetch del primo elemento
                        //dello stack o l'elemento presente sopra lo stack
                        .peek(System.out::println)
                        .count();
    }
    
    //Lista dei titoli dei libri CYBERPUNK o FANTASY
    public static void query2(){
        System.out.println("\n# Query 2");
        List<String> list = Stream.generate(Libro::gen)
                        .limit(10)
                        .filter(x -> x.getCategoria() == Categoria.CYBERPUNK 
                        || x.getCategoria() == Categoria.FANTASY)
                        //map() Eseguito su una istanza Libro
                        //restituisce i valori in uscita da getTitolo
                        .map(Libro::getTitolo)
                        //.collect con .toList() accumula gli elementi 
                        //dell'input in una nuova lista
                        .collect(Collectors.toList());
                list.forEach(System.out::println);
    }

    //Somma dei costi di tutti i libri
    public static void query3(){
        System.out.println("\n# Query 3 ");
        int sum = Stream.generate(Libro::gen)
                .limit(5)
                .peek(System.out::println)
                .map(Libro::getPrezzo)
                //.reduce() combina tutti gli elementi,
                //applicando operazioni binarie di ogni elemento
                // e il primo argomento dell'operazione è
                //il valore di ritorno della operazione precedente
                //e il secondo argomento dell elemento corrente
                //dello stream (una specie di somma += somma)
                .reduce(0, Integer::sum);
        System.out.println("Somma = "+ sum);
    }

    //Somma in dollari dei costi di tutti i lbri (1 Eur = 1.12 USD)
    public static void query4(){
        System.out.println("\n# Query 4 ");
        long sum = Stream.generate(Libro::gen)
                .limit(5)
                .map(Libro::getPrezzo)
                .map(x -> x * 1.12)
                .map(Math::round)
                .peek(System.out::println)
                .reduce((long) 01, Long::sum);
            System.out.println("Somma = " + sum);
    }

    //Stampa tutti i libri con prezzo compreso tra 10 e 15
    public static void query5(){
        System.out.println("\n# Query 5");
        Stream.generate(Libro::gen)
                .limit(5)
                .filter(x -> x.getPrezzo() >= 10)
                .filter(x -> x.getPrezzo() <= 15)
                .forEach(System.out::println);
    }

    //Titolo del Libro meno caro( ma a partire da 12)
    public static void query6(){
        System.out.println("\n# Query 6");
        Optional<Libro> book = Stream.generate(Libro::gen)
                .limit(5)
                .filter(x -> x.getPrezzo() >=12)
                .min(Comparator.comparing(Libro::getPrezzo));

            if(book.isPresent())
                System.out.println("Libro : " + book.get());
            else
                System.out.println("Nessun libro rispetta i criteri");
    }

    //Stampa la lista dei libri ordinati per prezzo
    public static void query7(){
        System.out.println("\n# Query 7");
        Stream.generate(Libro::gen)
                .limit(10)
                .sorted(Comparator.comparing(Libro::getPrezzo))
                .forEach(System.out::println);
    }

    //Totale vendite per ogni libro venduto (SENZA groupingBy)
    public static void query8(){
        System.out.println("\n# Query 8");
        List <Libro> list = Stream.generate(Libro::gen)
                        .limit(5)
                        .collect(Collectors.toList());
        list.stream()
            .map(Libro::getTitolo)
            //.distinct() restituisce unn uovo stream di 
            // elementi distinti dati dallo stream
            .distinct()
            .peek(t -> System.out.print("Titolo: " + t + " Conteggio: "))
            .forEach(t -> System.out.println(
                                    list.stream()   
                                        .filter(x -> x.getTitolo().equals(t))
                                        .count()));               
    }

    //Lista raggruppati per categoria (SENZA groupingBy)
    public static void query9(){
        System.out.println("\n# Query 9");
        List <Libro> list = Stream.generate(Libro::gen)
                            .limit(5)
                            .collect(Collectors.toList());

        list.stream()
                .map(Libro::getCategoria)
                .distinct()
                .peek(c -> System.out.println("Categoria: " + c))
                .forEach(c -> list.stream()
                                .filter(x -> x.getCategoria() == c)
                                .map(Libro::getTitolo)
                                .forEach(t -> System.out.println("- " + t)));
                    
    }

    //Creare una lista di libri fantasy da "Harry potter 1" 
    // a "Harry Potter 7" tutti da 15E
    private static List <Libro> query10(){
        System.out.println("\n# Query 10");
        List <Libro> list = IntStream.rangeClosed(1,7)
                            .mapToObj(n -> new Libro("Harry Potter " + n, Categoria.FANTASY,15))
                            .collect(Collectors.toList());
            list.forEach(System.out::println);
            return list;
    }

    //Sfruttando il metodo precedente, ottenere la lista
    // di libri e mescolarla in ordine casuale
    private static void query11(){
        System.out.println("\n# Query 11");
        List <Libro> inputList = query10();

        System.out.println();

        Stream.generate(() -> (int) (Math.random() * inputList.size()))
                            .distinct()
                            .limit(inputList.size())
                            .map(i -> inputList.get(i))
                            .forEach(System.out::println);
    }

    //Data una lista di libri, stampare il primo che un 
    //prezzo maggiore del precedente

    private static void query12(){
        System.out.println("\n# Query 12");
        List<Libro> list = Stream.generate(Libro::gen)
                    .limit(2)
                    .peek(System.out::println)
                    .collect(Collectors.toList());

        System.out.println();

        IntStream.range(1, list.size())
                .filter(i -> list.get(i-1).getPrezzo() < list.get(i).getPrezzo())
                .mapToObj(i -> list.get(i))
                .peek(System.out::println)
                .findAny();
    }

    //Data una lista di libri, stampare il primo che ha
    //un prezzo maggiore del precedente
    private static void query13(){
        System.out.println("\n# Query 13");
        List <Libro> list = Stream.generate(Libro::gen)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();

        list.stream()
                .filter(x -> isBiggerThanPrev(x))
                .peek(System.out::println)
                .findAny();
    }

    private static Libro prev = null;
    private static boolean isBiggerThanPrev(Libro x){
        if(prev == null){
            prev = x;
            return false;
        }
        boolean ret = prev.getPrezzo() < x.getPrezzo();
        prev = x;

        return ret;
    }

    private static void query14(){
        System.out.println("\n# Query 14");
        List <Libro> list = Stream.generate(Libro::gen)
                        .limit(5)
                        .peek(System.out::println)
                        .collect(Collectors.toList());

        list.forEach( x -> x.setPrezzo(
                    getSconto(x.getCategoria()).apply(x.getPrezzo())));

        System.out.println();
        list.forEach(System.out::println);
    }

    // 1) Lista, somma dei costi di ogni categoria di libri
    // 2) Lista, di ogni autore senza che si ripeta
    // 3) Il libro con costo maggiore della categoria "informatica"
    // 4) La somma del peso di tutti i libri.


    // 3) Il libro con costo maggiore della categoria "informatica"
    public static void query15(){
        System.out.println("\n # Query 15");
        Optional<Libro> book = Stream.generate(Libro::gen)
                .limit(5)
                .filter(x -> x.getPrezzo() > 0  && x.getCategoria() == Categoria.INFORMATICA)
                .max(Comparator.comparing(Libro::getPrezzo));

            if(book.isPresent())
                System.out.println("Libro : " + book.get());
            else
                System.out.println("Nessun libro rispetta i criteri");                  
    }
    // 1) Lista, somma dei costi di ogni categoria di libri
    public static void query16(){
    }




    private static Function <Integer,Integer> getSconto(Categoria cat){
        Map<Categoria, Function<Integer,Integer>> sconti = Map.of(
            Categoria.FANTASY, x -> Math.abs(x - 5),
            Categoria.CYBERPUNK, x -> (int) Math.floor(x * 0.1),
            Categoria.THRILLER, x -> (int) Math.floor(x * 0.5),
            Categoria.STORICO, x -> x,
            Categoria.INFORMATICA, x -> x*2 + 10);

        return sconti.get(cat);
    }

}