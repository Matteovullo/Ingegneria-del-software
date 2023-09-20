public class Main {

    public static void main(String [] args) {
        AlertStateContext obj = new AlertStateContext();
        obj.alert(); //inizialmente è settato a new Vibration
        obj.setState(new Silent());
        obj.alert();
    }
    
}
