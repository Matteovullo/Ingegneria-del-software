public class CerchioRosso implements DisegnaAPI {

    @Override
    public void disegnaCerchio(int raggio, int x, int y) {
        System.out.println("Cerchio disegnato");
        System.out.println("colore: rosso\n" + "raggio: " + raggio + " x: " + x + " y: " + y);
    }

}