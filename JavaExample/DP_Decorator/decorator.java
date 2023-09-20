package DP_Decorator;

// COMPONENT

interface Spada {
    public String getDesc();

    public double getCost();
}

// CONCRETE COMPONENT

class SpadaBase implements Spada {
    public String getDesc() {
        return " SpadaBase";
    }

    public double getCost() {
        return 8.00;
    }
}

// DECORATOR

class SpadaDecorator implements Spada {
    private Spada s;

    public SpadaDecorator(Spada s) {
        this.s = s;
    }

    public String getDesc() {
        return s.getDesc();
    }

    public double getCost() {
        return s.getCost();
    }
}

// CONCRETES DECORATORS

class SpadaX extends SpadaDecorator {
    public SpadaX(Spada s) {
        super(s);
    }

    public String getDesc() {
        return super.getDesc() + " - 0.70 Cost ";
    }

    public double getCost() {
        return super.getCost() - 0.70;
    }

}

class SpadaY extends SpadaDecorator {
    public SpadaY(Spada s) {
        super(s);
    }

    public String getDesc() {
        return super.getDesc() + " + 0.70 Cost ";

    }

    public double getCost() {
        return super.getCost() + 0.20;
    }
}

class Client {

    public static void main(String[] args) {
        Spada sX = new SpadaX(new SpadaBase());
        // Spada sY = new SpadaY(new SpadaBase());
        Spada s = new SpadaBase();

        System.out.println("SpadaBase : " + s.getCost() + s.getDesc());
        System.out.println("SpadaX : " + sX.getCost() + sX.getDesc());

    }

    /*
     * new SpadaX(new SpadaBase())
     */
}
