//MEDIATOR definisce un interfaccia per altri oggetti connessi al COLLEAGUE
//La parte della complessità che risulta nella gestione delle dipendenze è spostata dagli
//oggetti che controlla MEDIATOR
//Inoltre MEDIATOR non è riusabile poiche' la gestione deller dipendenze implementata è
// solo per una specifica applicazione
public interface Mediator{
    void taskCompleted(String task);
    void loadValues();
    void show();
}