public class Main {

    public static void main(String [] args) {

        Human h1 = new Human("Elizabeth", "McQueen", 19);
        Human h2 = (Human) h1.getClone();

    }
    
}
