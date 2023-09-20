public abstract class Figura {
    
    protected DisegnaAPI disegnaAPI;
    
    protected Figura(DisegnaAPI disegnaAPI) {
        this.disegnaAPI = disegnaAPI;
    }

    public abstract void disegna();

}
