import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
// a() un metodo che trova le istanze della lista t1 che sono triangoli isosceli
// suggerimento (verificare che due angoli siano uguali)
// b() un metodo che restituisce la base dei triangoli isosceli trovati precedentemente
// (la base di un triangolo isoscele è il lato che ha dimensione diversa dagli altri due lati)
//c() un metodo che restituisce la lsita dei lati maggiori delle istanze di t1,

public class Main{

    public static void main (String[] args){
        query0();
    }

    public static void query0(){

        System.out.println("# Query 0");

        Stream.generate(Triang::gen)
            .limit(3)
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }

    public static void query1(){

        System.out.println("# Query 1");
        
    }
}