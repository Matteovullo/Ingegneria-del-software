public class Silent implements MobileAlertState {  //concretestate

    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Silent...");
    }
    
}
