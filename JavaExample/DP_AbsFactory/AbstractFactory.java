package DP_AbsFactory;

//ABS PRODUCT A
interface Icon {
    public void draw();

    public void fill();
}

// ABS PRODUCT B
interface Text {
    public void tell();

    public void shout();
}

// ABS FACTORY
interface Creator {
    public Icon getIcon(); // create method

    public Text getText();
}

// CONC FACTORY 1
class Creator1 implements Creator {

    public Icon getIcon() {
        return new Circle();
    }

    public Text getText() {
        return new Japanese();
    }
}

// PRODUCT A1

class Circle implements Icon {

    public void draw() {
        System.out.println(" ( ) ");
    }

    public void fill() {
        System.out.println(" (o) ");
    }
}

// CONC FACTORY 1

class Creator2 implements Creator {

    public Icon getIcon() {
        return new Box();
    }

    public Text getText() {
        return new English();
    }
}

// PRODUCT A2
class Box implements Icon {

    public void draw() {
        System.out.println(" [ ] ");
    }

    public void fill() {
        System.out.println(" [X] ");
    }
}

class Japanese implements Text { // ProductB1
    public void tell() {
        System.out.println("( Youkoso. Konnichiwa! Hajimemashite )");
    }

    public void shout() {
        System.out.println("( Shizuka ni shite kudasai )");
    }
}

class English implements Text { // ProductB2
    public void tell() {
        System.out.println("::::: Welcome. Nice to meet you :::::");
    }

    public void shout() {
        System.out.println("::::: Be quiet please! :::::");
    }
}

class Client {
    public static void main(String[] args) {
        Creator c1 = new Creator2();
        Icon ic = c1.getIcon();
        Text t = c1.getText();
        ic.fill();
        ic.draw();
        t.tell();
        t.shout();
    }
}