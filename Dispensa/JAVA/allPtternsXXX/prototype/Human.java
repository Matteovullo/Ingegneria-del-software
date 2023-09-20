public class Human implements Prototype {

    private String name;
    private String surname;
    private int age;

    public Human() {
        System.out.println("Human description");
        System.out.println("Name " + " Surname " + " Age ");
    }

    public Human(String name, String surname, int age) {
        this(); // per richiamare il costruttore sopra
        this.name = name;
        this.surname = surname;
        this.age = age;
        showHuman();
    }

    private void showHuman() {
        System.out.println(name + " " + surname + " " + age);
    }

    @Override
    public Prototype getClone() {
        return new Human(name, surname, age);
    }


}
