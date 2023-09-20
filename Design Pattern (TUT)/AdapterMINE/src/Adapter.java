public class Adapter extends Adaptee implements Target{

    //richiama la funzione nel TARGET
    //e usa come argomento le funzioni nell ADAPTEE
    //e crea i metodi delle funzioni dell ADAPTEE
    public Adapter(){
        super();
    }

    @Override
    public void healHP(int heal){
        this.doHeal(heal);
    }

    @Override
    public void damageHP(int damage){
        this.doDamage(damage);
    }

    @Override
    public void doDamage(int damage){
        int adaptedDamage = damage*10;
        super.doDamage(adaptedDamage);
    }
    @Override
    public void doHeal(int heal){
        int adaptedHeal = heal * 5;
        super.doHeal(adaptedHeal);
    }

}