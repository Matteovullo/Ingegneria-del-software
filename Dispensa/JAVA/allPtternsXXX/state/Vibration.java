public class Vibration implements MobileAlertState { //concretestate

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Vibration...");
    }
    
}
