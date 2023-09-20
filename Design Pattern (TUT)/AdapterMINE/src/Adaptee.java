public class Adaptee{
    //crea l'output delle funzioni create in ADAPTER
    //dove vengono implementati i loro metodi
    public void doHeal(int heal){

        System.out.println("HP healed :" + heal);
    }

    public void doDamage(int damage){
        System.out.println("Damage deal : " + damage );
    }
}