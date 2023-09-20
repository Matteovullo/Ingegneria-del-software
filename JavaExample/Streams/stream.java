/* 
A)  Un metodo che per incrementa il costo di ciascuna istanza
del 5% e restituisce una lsita con le istanze aventi il prezzo
modificato

B) un metodo che restituisce la somma del costo delle istanze di
Auto presenti nella lista a1

C) un metodo che trova il valore minore del costo delle istanze
di Auto nella lista a1 e le restituisce.

D) un metodo che ordina per costo le istanze di a1.
 * 
 */

package Streams;

import java.util.Optional;
import java.util.List;
import java.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class stream {

    private final static List<Auto> a1 = List.of(
            new Auto("categoria1", "rossa", 2100, "modello1"),
            new Auto("categoria1", "blu", 3000, "modello1"),
            new Auto("categoria2", "rossa", 2000, "modello2"),
            new Auto("categoria2", "blu", 2500, "modello3"));

    public static void main(String[] args) {

        query0();
        query1();
        query2();
        query3();
        query5();
    }

    /*
     * A) Un metodo che per incrementa il costo di ciascuna istanza
     * del 5% e restituisce una lsita con le istanze aventi il prezzo
     * modificato
     */
    private static void query0() {
        System.out.println("# Query 0");
        a1.stream()
                .limit(4)
                .map(x -> x.costo)
                .map(x -> x * 1.5)
                .forEach(x -> System.out.println(x));
    }
    /*
     * B) un metodo che restituisce la somma del costo delle istanze di
     * Auto presenti nella lista a1
     */

    private static void query1() {
        System.out.println("# Query 1");
        Integer sum = a1.stream()
                .map(x -> x.costo)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }

    /*
     * C) un metodo che trova il valore minore del costo delle istanze
     * di Auto nella lista a1 e le restituisce.
     */
    private static void query2() {
        System.out.println("# Query 2");
        Optional<Integer> car = a1.stream()
                .limit(5)
                .filter(x -> x.costo >= 0)
                .map(x -> x.costo)
                .min(Comparator.comparing(x -> x));
        if (car.isPresent()) {
            System.out.println(car.get());
        }

    }

    // private static Map<String, String> getMap() {
    // return a1.stream().collect(Collectors.toMap(x -> x.categoria, x ->
    // x.categoria));
    // }

    /*
     * D) un metodo che ordina per costo le istanze di a1.
     * 
     */

    private static void query3() {
        System.out.println("# Query 3");
        a1.stream()
                .sorted(Comparator.comparing(x -> x.costo))
                .map(x -> x.costo)
                .forEach(x -> System.out.println(x));
    }

    private static List<Auto> query4() {
        System.out.println(" Getting auto's categoria1");
        List<Auto> list = a1.stream()
                .filter(x -> x.categoria.equals("categoria1"))
                .collect(Collectors.toList());

        return list;
    }

    private static void query5() {
        System.out.println("# Query 5 ");
        List<Auto> list1 = query4();

        list1.stream()
                .filter(auto -> auto.costo > 2200)
                .forEach(x -> System.out.println(x.categoria + " " + x.costo + " " + x.modello));

    }

}