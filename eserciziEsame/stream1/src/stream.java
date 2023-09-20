import java.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class stream {

    /*1
    un metodo che trova le istanze della lista t1 
    che sono triangoli isosceli
    */
    private final static List <triang> t1 = List.of(
        new triang(13,33,40,5,5,5),
        new triang(15,15,30,5,5,5),
        new triang(30,30,13,5,5,5)
    );

    public List<triang> isosceli(){
        return t1.stream()
            .filter(x -> x.angolo1() == x.angolo2() || x.angolo2() == x.angolo3() || x.angolo1() == x.angolo3())
            .collect(collectors.tolist());
    }

    public integer base(triang t){
        if(x.lato1 == x.lato2){
            return x.lato3;
        }
        else if(x.lato2 == x.lato3){
            return x.lato1;
        }
        else if (x.lato3 == x.lato1){
            return x.lato2;
        }
    }
    /*2
     * un metodo che restituisce la base dei triangoli isosceli
     * trovati precedentemente.
     */
    public integer baseIsosceli(){
        return t1.stream()
        .filter(x -> x.angolo1() == x.angolo2() || x.angolo2() == x.angolo3() || x.angolo1() == x.angolo3())
        .map(stream::base);
    }
    /*3
     *  Un metodo che restituisce la lista dei lati
     * maggiori delle istanze di t1
     */
    public integer maggiore(triang t){
        if(x.lato1() > x.lato2() && x.lato1() > x.lato3()){
            return x.lato1();
        }
        else if (x.lato2() > x.lato3() && x.lato2() > x.lato1()){
            return x.lato2();
        }
        else if(x.lato3() > x.lato2() && x.lato3() > x.lato1()){
            return x.lato3();
        }
    }

    public List<integer> latiMagg(){
        return t1.stream()
            .map(stream::maggiore)
            .collect(collectors.tolist());
    }
    /*4
     * Un metodo che trova la somma dei perimetri delle istanze di t1
     */

     public integer perim(triang t){
        return t1.stream()
                .map(x -> x.lato1() + x.lato2() + x.lato3())
                .reduce(0,(acc,x) -> acc+x);
     }

     public static void main(String[] argc){
        
     }
}
