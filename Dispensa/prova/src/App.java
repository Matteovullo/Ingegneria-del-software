public class App {
    public static void main(String[] args) throws Exception {

        Libreria libreria= new Libreria();
        Scaffale scaffale = new Scaffale("hard");
        Libro libro = new Libro("harry", "hard",50.90);
        Libro libro2 = new Libro("giuse", "hard",20.90);
        Libro libro3 = new Libro("gesua", "fantasy",15.90);

        scaffale.aggiungiLibro(libro);
        libreria.creaScaffale(scaffale);

        scaffale.aggiungiLibro(libro2);
        libreria.creaScaffale(scaffale);

        scaffale.aggiungiLibro(libro3);
        libreria.creaScaffale(scaffale);
        libro.sconto(50);
        libro2.sconto(50);
        libro3.sconto(50);

        libreria.printAll();
        


    }
}
