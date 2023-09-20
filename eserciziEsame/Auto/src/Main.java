import java.util.List;

import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main{

    private final static List <Auto> a1 = List.of(
        new Auto("categoria1","rossa",2100,"modello1"),
        new Auto("categoria1","blu",3000,"modello1"),
        new Auto("categoria2","rossa",2000,"modello2"),
        new Auto("categoria2","blu",2500,"modello3")
    );

    public static void main(String[] args){
        query0();
        query1();
        query2();
        query3();
    }

    private static void query0(){
        System.out.println("# Query 0");
        a1.stream()
            .limit(4)
            .map(Auto::getCosto)
            .map(x -> x * 1.5)
            .map(Math::round)
            .forEach(x -> System.out.println(x));
    }

    private static void query1(){
        System.out.println("# Query 1");
        int x = a1.stream()
            .map(Auto::getCosto)
            .reduce(0,(v,t)->v+t);
        System.out.println("somma = " + x);
    }

    private static void query2(){
        System.out.println("# Query 2");
        Optional<Auto> car = a1.stream()
            .limit(5)
            .filter(x -> x.getCosto() >= 0)
            .min(Comparator.comparing(Auto::getCosto));
        System.out.println(car.get());
    }

    private static void query3(){
        System.out.println("# Query 3");
        a1.stream()
            .limit(4)
            .sorted(Comparator.comparing(Auto::getCosto))
            .forEach(System.out::println);
    }


}