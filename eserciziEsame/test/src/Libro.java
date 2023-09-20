


public class Libro{

    String autore;
    Categoria categoria;
    int peso,costo;

    public static void main(String[] args){
        System.out.println();
    }

    private static Libro[] prodLib = new Libro[]{
        new Libro("Autore1",Categoria.GIALLO,5,35),
        new Libro("Autore2",Categoria.INFORMATICA,4,55),
        new Libro("Autore1",Categoria.CYBERPUNK,15,78),
        new Libro("Autore3",Categoria.GIALLO,2,25)
    };

    public Libro( String autore, Categoria categoria,int peso, int  costo){
        this.autore = autore;
        this.categoria = categoria;
        this.peso = peso;
        this.costo = costo;
    }

    public static Libro gen(){
        int i = (int) (Math.random() * prodLib.length);
        return prodLib[i];
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public int getCosto(){
        return costo;
    }

    public int getPeso(){
        return peso;
    }
}