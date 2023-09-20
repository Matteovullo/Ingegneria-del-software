import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.*;

public class Main{
    // 1) Lista, somma dei costi di ogni categoria di libri
    // 2) Lista, di ogni autore senza che si ripeta
    // 3) Il libro con costo maggiore della categoria "Giallo"
    // 4) La somma del peso di tutti i libri.

    public static void main(String[] args){
        query0();
        query2();
    }

      // 3)
    public static void query0(){
        System.out.println("# Query 0");
        List<Libro> list = Stream.generate(Libro::gen)
                        .filter(x -> x.getCategoria() == Categoria.GIALLO)
                        .collect(Collectors.toList());

        list.stream()
            .map(x -> x.getCosto())
            .forEach(x -> System.out.println(x));
    }
    // 4)

    public static void query2(){
        List<Libro> list = Stream.generate(Libro::gen)
                        .filter(x -> x.getCategoria() == Categoria.GIALLO)
                        .collect(Collectors.toList());

        list.stream()
                    .map(x -> x.getCosto() * 2)
                    .forEach(x -> System.out.println(x));
    }

}