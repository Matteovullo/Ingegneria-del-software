package DP_Singleton;

public class MainBalancer {
    public static void main(String[] args) {
        Balancer b = Balancer.getBalancer();
        System.out.println(b.getHost());
        System.out.println(b.getHost());
        System.out.println(b.getHost());

    }
}