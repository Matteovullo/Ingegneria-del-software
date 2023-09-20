public class CerchioVerde implements DisegnaAPI {

    @Override
    public void disegnaCerchio(int raggio, int x, int y) {
        System.out.println("Cerchio disegnato");
        System.out.println("colore: verde\n" + "raggio: " + raggio + " x: " + x + " y: " + y);
    }
    
}
