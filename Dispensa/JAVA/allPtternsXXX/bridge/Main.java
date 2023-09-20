public class Main {

    public static void main (String[] args) {
        Figura cerchioRosso = new Cerchio(100, 100, 10, new CerchioRosso());
        Figura cerchioVerde = new Cerchio(200, 200, 20, new CerchioVerde());

        cerchioRosso.disegna();
        cerchioVerde.disegna();
    }
    
}
