import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// a() un metodo che trova le istanze della lista t1 che sono triangoli isosceli
// suggerimento (verificare che due angoli siano uguali)
// b() un metodo che restituisce la base dei triangoli isosceli trovati precedentemente
// (la base di un triangolo isoscele è il lato che ha dimensione diversa dagli altri due lati)
//c() un metodo che restituisce la lsita dei lati maggiori delle istanze di t1,

public class ListaTriang{
    
    private List <Triang> t1 = Arrays.asList(
        new Triang(15,15,30),
        new Triang(30,30,13));

        public void query1(){
            System.out.println("\n# Query1");
            List<Integer> t = t1.stream()
                         .map(t1 -> t1.getLato0()&t1.getLato1()+t1.getLato2())
                         .collect(Collectors.toList());
                         
                System.out.println("Lato 1" + t);

        }
}