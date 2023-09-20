import java.util.Map;

//CONCRETECREATOR per il "Factory Method" che fornisce vari metodi factory per
// instanziare  LEAF o COMPOSITE
public class Ricettario{
    private static Map<String, Integer> tabellaCalorie = Map.of(
        "pomodoro", 18,
			"farina", 364,
			"uova", 155,
			"cipolla", 40,
			"macinato", 212,
			"olio", 884,
			"burro", 717,
			"panna", 204,
			"parmigiano", 431,
			"funghi", 387);

    public static Pietanza getIngrediente(String nome, int quantita)
    {
        if (tabellaCalorie.containsKey(nome))
        {
            return new Ingrediente ( nome,quantita,tabellaCalorie.get(nome));
        }
        else
        {
            return new Ingrediente(nome , quantita, 0);
        }
    }

    public static Pietanza getPreparato(String nome){
        return new Preparato(nome);
    }
}