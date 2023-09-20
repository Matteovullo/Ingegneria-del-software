// Adapter

public class TheGoblin extends PelleVerde implements Goblin{

    public TheGoblin(){
        super();
    }

    @Override
    public void tiraFreccia(int damage){
        this.scagliaPezzoDiLegno(damage);
    }

    @Override
    public void scagliaPezzoDiLegno (int damage){
        int adaptedDamage = damage*10;
        super.scagliaPezzoDiLegno(adaptedDamage);
    }

    @Override
    public void scagliaPezzoDiMetallo(int damage){
        int adaptedDamage = damage*15;
        super.scagliaPezzoDiMetallo(adaptedDamage);
    }

    @Override
    public void tiraLancia(int damage){
        this.scagliaPezzoDiMetallo(damage);
    }

    
}