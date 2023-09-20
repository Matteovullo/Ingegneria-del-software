public class Client{

    public static void main(String[] args){
        //crea oggetto di tipo TARGET riferito all'ADAPTER
        Target t = new Adapter();

        t.healHP(5);
        t.damageHP(2);
    }
}