public class Main {
    public static void main(String[] args) throws Exception {
        Figura cerchioRosso = new Cerchio(100,10,20,new CerchioRosso());
        Figura cerchioVerde = new Cerchio(100,10,20,new CerchioVerde());

        cerchioRosso.disegna();
        cerchioVerde.disegna();
    }
}
