/*client = main
  product = notifiche
  concreteProduct = notificaEMAIL, notificaPUSH, notificaSMS
  Creator, ConcreteCreator = NotificheFactory
*/
public class Main {

  public static void main(String[] args) {

    NotificheFactory obj = new NotificheFactory();

    Notifiche notifica1 = obj.creaNotifica("SMS");
    Notifiche notifica2 = obj.creaNotifica("computer");
    notifica1.avvertiUtente();
    notifica2.avvertiUtente();

  }

}
