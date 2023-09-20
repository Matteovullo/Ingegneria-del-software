package DP_Strategy;

interface Strategy {
    public int doOperation(int num1, int num2);
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSub implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Client {
    public static void main(String[] args) {
        Context c = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + c.executeStrategy(10, 5));

        c = new Context(new OperationSub());
        System.out.println("10 - 5 = " + c.executeStrategy(10, 5));
    }
}