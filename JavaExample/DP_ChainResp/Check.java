package DP_ChainResp;

public abstract class Check {
    protected Check successor;

    public void setClass(Check successor) {
        this.successor = successor;
    }

    public abstract void CheckRequest(int check);

    public void check(int i) {
    }
}

// ConcreteHandler
class FirstClass extends Check {
    public FirstClass(Check succ) {
        this.successor = succ;
    }

    public void CheckRequest(int check) {
        if (check > 1500) {
            successor.CheckRequest(check);
        } else {
            System.out.println(" First class costs: " + check);
        }
    }
}

// ConcreteHandler
class SecondClass extends Check {
    public SecondClass(Check succ) {
        this.successor = succ;
    }

    public void CheckRequest(int check) {
        if (check > 2500) {
            successor.CheckRequest(check);
        } else {
            System.out.println(" Second class costs: " + check);
        }
    }
}
// ConcreteHandler

class ThirdClass extends Check {
    public ThirdClass(Check succ) {
        this.successor = succ;
    }

    public void CheckRequest(int check) {
        if (check > 3000) {
            System.out.println(" Too much ");
        } else {
            System.out.println(" Third class costs: " + check);
        }
    }

    public static void main(String[] args) {

        Check c = new FirstClass(new SecondClass(new ThirdClass(null)));
        c.CheckRequest(1500); // check > 3000 = toomuch . check < 3000 print 2900
    }
}
