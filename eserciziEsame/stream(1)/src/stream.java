import java.util.List;
import java.util.stream.Collectors;
public class stream{

    //un metodo che trova le istanze della lista t1 che sono triangoli iscoceli
    private record Triang(int lato1,int lato2,int lato3,int angolo1,int angolo2,int angolo3){
    }
    private final static List <Triang> t1 =List.of(
        new Triang(15,15,30,90,90,45)
    );

    public List <Triang> isosceli(){
        return t1.stream()
                .filter(t1 -> t1.angolo1() == t1.angolo2() || t1.angolo2() == t1.angolo3() || t1.angolo1() == t1.angolo3())
                .collect(Collectors.toList());
    } 

    public int base(Triang t1){
        if(t1.lato1() == t1.lato2())
            return t1.lato3();
        else if(t1.lato1() == t1.lato3())
            return t1.lato2();
        else
            return t1.lato1();
    }

    public int baseIscosceli(){
        return t1.stream()
                .filter(t1 -> t1.angolo1() == t1.angolo2() || t1.angolo2() == t1.angolo3() || t1.angolo1() == t1.angolo3())
                .map(stream::base);
    }

    public int maggiore(Triang t1){
        if(t1.lato1() > t1.lato2() && t1.lato1() > t1.lato3())
            return t1.lato1();
        else if(t1.lato2() > t1.lato3() && t1.lato2() > t1.lato1())
            return t1.lato2();
        else 
            return t1.lato3();
    }

    public List <Integer> latimagg(){
        return t1.stream()
            .map(stream::maggiore)
            .collect(Collectors.toList());
    }

    public int somma(){
        return t1.stream()
            .map(t1 -> t1.lato1() + t1.lato2() + t1.lato3())
            .reduce(0,(acc,t1)-> acc+t1);
    }

    public static void main(String[] args){
        somma();
    }
}