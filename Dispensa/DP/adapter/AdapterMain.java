public class AdapterMain {
    public static void main(String[] args) {
        Target t = new Adapter();
        System.out.println(t.getInt());
    }

}