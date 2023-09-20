public class Adapter implements Target {
    private Adaptee server;

    public int getInt() {
        if (server == null)
            server = new Adaptee();
        return server.getValore();
    }
}