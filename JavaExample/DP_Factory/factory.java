package DP_Factory;

// CREATOR

class Deposito {
    public Busta getBusta() {
        return new Grande();
    }

    public Busta getMini() {
        return new Mini();
    }
}

interface Busta {
    public String getTipo();

    public int getPeso();
}

class Grande implements Busta {
    private String tipo = "Grande";
    private int peso = 30;

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        return peso;
    }
}

class Mini implements Busta {
    private String tipo = "Mini";
    private int peso = 15;

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        return peso;
    }
}

class Client {

    public static void main(String[] args) {
        Deposito d = new Deposito();

        Busta mini = d.getMini();

        System.out.println("Peso busta mini : " + mini.getPeso());
    }
}