package DP_Composite;

import java.util.List;
import java.util.ArrayList;

// COMPONENT
public abstract class Composite {

    protected String name;

    public abstract int getSize();

    public abstract void print();
}

// LEAF
class JPG extends Composite {

    private int size;

    public JPG(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println("JPG: " + name + ", size:" + size);
    }
}

// COMPOSITE
class Directory extends Composite {
    private List<Composite> dList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Composite component) {
        dList.add(component);
    }

    public void remove(Composite component) {
        dList.remove(component);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Composite d : dList) {
            size += d.getSize();
        }
        return size;
    }

    @Override
    public void print() {
        System.out.println("\nDirectory: " + name);
        if (dList.isEmpty())
            System.out.println("Is empty");
        for (Composite d : dList) {
            System.out.println(" - ");
            d.print();
        }
    }

    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.print();

        JPG pic1 = new JPG("pic1.jpg", 100);
        JPG pic2 = new JPG("pic2.jpg", 150);

        root.add(pic1);
        root.add(pic2);
        root.print();
        System.out.println("Total size: " + root.getSize());
    }
}
