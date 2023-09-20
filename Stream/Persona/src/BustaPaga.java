// Comparable utilizza il metodo compareTo() all'interno della classe BustaPaga
// che confronta un oggetto con un altro e restituisce un valore min,magg o uguale a zero

public class BustaPaga implements Comparable < BustaPaga > {

    private Persona dipendente;
    private int totale;
    private int costoBase;

    public BustaPaga(Persona p, int costo){
        dipendente = p;
        costoBase = costo;
    }

    public BustaPaga calcolaCostoBase(){
        totale = costoBase * 25;
        return this;
    }

    public int getCosto(){
        return totale;
    }

    public BustaPaga aggiungiBonus(){
        totale = (int) Math.round(totale * 1.1);
        return this;
    }

    public Persona getPersona(){
        return dipendente;
    }

    public BustaPaga stampa(){
        System.out.println(dipendente.getNome() + "\t" + totale);
        return this;
    }


    @Override
    public int compareTo(BustaPaga b) {
        return dipendente.getNome().compareTo(b.getPersona().getNome());
    }

}