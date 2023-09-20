//L'interfaccia che il chiamante si aspetta
//Ovvero funzioni chiamate in Adapter e Client

public interface Target{
    //TARGET crea delle funzioni che verranno utilizzate
    //attraverso un parametro creato dalle funzioni dell'ADAPTEE
    //che poi verranno utilizzate nel CLIENT
    public void healHP(int heal);
    public void damageHP(int damage);
}