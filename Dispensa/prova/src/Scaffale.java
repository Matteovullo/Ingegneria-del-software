import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Scaffale {
    private String categoria;
    private List<Libro> libri = new ArrayList<Libro>();

    Scaffale(String categoria)
    {
        this.categoria = categoria;
    }

    Scaffale(String categoria, Libro libro)
    {
        this.categoria = categoria;
        this.aggiungiLibro(libro);
    }

    Scaffale(String categoria, ArrayList<Libro> libri)
    {
        this.categoria = categoria;
        this.aggiungiLibri(libri);
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void aggiungiLibro(Libro libro)
    {
        if(libri.size() >= 10) {
            System.out.println("COGLIONE E' PIENO");
            return;
        }
        if(libri.contains(libro))
        {
            System.out.println("COGLIONE GIà IL LIBRO C'E'");
            return;
        }
        if(libro.getGenere() != this.categoria)
        {
            System.out.println("COGLIONE CATEGORIA NON CORRISPONDENTE");
            return;
        }
        libri.add(libro);
        libri.sort(Comparator.comparing(Libro::getNome));
    }   

    public void aggiungiLibri(ArrayList<Libro> libri)
    {
        for(Libro libro : libri)
        {
            aggiungiLibro(libro);
        }
    }
    
    public void rimuoviLibro(Libro libro)
    {
        libri.remove(libro);
    }

    public void effettuaSconto(Double sconto)
    {
        for(Libro libro : libri)
        {
            libro.sconto(sconto);
        }
    }
    public void printAll()
    {
        System.out.println("categoria = " + categoria);
        
        for(Libro libro:libri){
            libro.printAll();
            System.out.println("\n");
        }
        
    }
    
}
