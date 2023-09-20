package challeng_state;

public class Personaggio{
    private State s=new Normale();

    public void modeStunnato(){
        s=new Stunnato();
    }

    public void modeNormale(){
        s=new Normale();
    }

    public void modeBuffato(){
        s=new Buffato();
    }

    public void mostra(){
        s.parla();
    }

} 