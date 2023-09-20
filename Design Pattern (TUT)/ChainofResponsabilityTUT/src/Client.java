public class Client{
    public static void main (String[] args) {
        Ufficiale c = new Capitano(new Maggiore(new Tenente(null)));
        c.check(3500);

        Ufficiale t = new Capitano(new Maggiore(null));
        t.check(1200);
    }
}