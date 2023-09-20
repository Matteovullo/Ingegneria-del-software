public record Auto(String categoria,String colore,int costo,String modello){

    public String getCategoria(){
        return categoria;
    }
    public String getColore(){
        return colore;
    }
    public int getCosto(){
        return costo;
    }
    public String getModello(){
        return modello;
    }

    public String stampa(){
        return ("Categoria: "+categoria+" Colore: "+ colore+" Costo: "+costo+" Modello: "+modello);
    }
}