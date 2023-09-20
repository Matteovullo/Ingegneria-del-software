package challeng_adapter;

public class Client {
    public static void main(String[] arg){
        Target a=new Adapter();
        a.add(5);
        a.add(7);
        a.add(10);
        System.out.println(a.get(0));
        a.remove(1);
    }
}
