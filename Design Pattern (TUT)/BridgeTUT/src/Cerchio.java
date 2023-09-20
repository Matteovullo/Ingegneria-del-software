public class Cerchio extends Figura{

    private int x,y,raggio;

    public Cerchio(int x,int y ,int raggio, DisegnaAPI disegnaAPI){
        super(disegnaAPI);
        this.x = x ;
        this.y = y;
        this.raggio = raggio;
    }
    public void disegna(){
        disegnaAPI.disegnaCerchio(raggio,x,y);
    }
}