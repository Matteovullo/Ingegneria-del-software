package Streams;

public class Auto {

    String categoria;
    String colore;
    int costo;
    String modello;

    public Auto(String categoria, String colore, int costo, String modello) {
        this.categoria = categoria;
        this.costo = costo;
        this.modello = modello;
        this.colore = colore;
    }

    public Integer getCosto() {
        return costo;
    }
}