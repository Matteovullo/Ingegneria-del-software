public class Client {
    public static void main(String[] args){
        Biglietto b=new Biglietto("Biglietto regalo", 1);
        Packaging p=new Packaging("Biglietto regalo", 1);
        Decorazione d=new Decorazione("Biglietto regalo", 1);
        b.printNome();
        b.getPrezzo();
        p.tipo();
        p.change();
        p.tipo();
        d.tipo();
        d.change();
        d.tipo();
    }
}
