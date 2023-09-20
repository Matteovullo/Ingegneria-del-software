import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main{


    private final static List <Triang> t1 = List.of(
        new Triang(13,33,40,5,5,5),
        new Triang(15,15,30,5,5,5),
        new Triang(30,30,13,5,5,5)
    );
    public static void main (String[] args){
        lati();
        sommaPerimetro();
        trovaBase();
        latoMagg();

    }

    private static void lati(){
        System.out.println("# Query 0");
        t1.stream()
            .map(x -> x.stampa())
            .forEach(x -> System.out.println(x));

    }


    private static void sommaPerimetro(){
        System.out.println("# Query 1");
        t1.stream()
            .limit(3)
            .map(x -> x.lato1() + x.lato2() + x.lato3())
            .forEach(x -> System.out.println("Perimetro triangolo : "+(x)));
    }
    
    private static void trovaBase(){
        System.out.println("# Query 2");

        t1.stream()
            .limit(3)
            .map(x -> x.getBase())
            .forEach(x -> System.out.println ((x)));
    }

    private static void latoMagg(){
        System.out.println("# Query 3");

        
            Comparator<Triang> comp = (l1,l2) -> l1.getLato1() - l2.getLato2();
    }
}