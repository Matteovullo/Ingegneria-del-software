public class Singleton {
    public static Singleton obj;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }

    public void operation() {
        System.out.println("Operazione");
    }

    public static void main(String[] args) {
        Singleton i = Singleton.getInstance();
        i.operation();
    }

}