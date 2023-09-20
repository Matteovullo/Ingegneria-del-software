package DP_Command;
// COMMAND

public interface Command {
    public void execute();
}

// CONC COMMAND
class FlipUp implements Command {
    private Light thelight;

    public FlipUp(Light light) {
        this.thelight = light;
    }

    public void execute() {
        thelight.turnOn();
    }
}

// CONC COMMAND
class FlipDown implements Command {
    private Light thelight;

    public FlipDown(Light light) {
        this.thelight = light;
    }

    public void execute() {
        thelight.turnOff();
    }
}

// RECEIVER
class Light {
    public void turnOn() {
        System.out.println("Light : turned on");
    }

    public void turnOff() {
        System.out.println("Light : turned off");
    }
}

// INVOKER

class Switch {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}

class Client {
    public static void main(String[] args) {
        Switch sw = new Switch();

        sw.setCommand(new FlipUp(new Light()));
        sw.invoke();
        sw.setCommand(new FlipDown(new Light()));
        sw.invoke();

    }
}