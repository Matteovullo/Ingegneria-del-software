package DP_Observer;

import java.util.List;

import java.util.ArrayList;

interface Observer {
    public void update();
}

class Subject {
    private List<Observer> list = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer o) {
        list.add(o);
    }

    public void detatch(Observer o) {
        list.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : list) {
            o.update();
        }
    }
}

class ConcreteSubject extends Subject {
    // INSTEAD OF HAVING A LIST
    private String name;

    public ConcreteSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // setState
    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

}

class ConcreteObserverA implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserverA(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Observer A: state has changed to " + subject.getState());
    }
}

class Client {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject(null);
        s.attach(new ConcreteObserverA(s));

        s.setState(3);
        s.getState();
    }
}