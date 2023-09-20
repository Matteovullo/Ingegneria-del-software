public class NotificheFactory {

    public Notifiche creaNotifica(String canale) {
        if (canale == null || canale.isEmpty()) {
            return null;
        }
        switch (canale) {
            case "SMS":
                return new NotificaSMS();
            case "EMAIL":
                return new NotificaEMAIL();
            case "PUSH":
                return new NotificaPUSH();
            default:
                throw new IllegalArgumentException("Canale sconosciuto: " + canale);
        }
    }

}
