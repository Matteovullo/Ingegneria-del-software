package DP_Singleton;

public class Balancer {
    private String[] hosts = new String[] { "host1", "host2", "host3" };
    private int x;
    private static Balancer b = new Balancer();

    private Balancer() {
        x = 0;
    }

    public String getHost() {
        if (x == hosts.length)
            x = 0;
        return hosts[x++];
    }

    public static Balancer getBalancer() {
        return b;
    }
}