import java.util.*;

public class Italian {
    private String text = " ";
    private List<String> d = Arrays.asList("Va bene", "Ciao",
            "Capito", "Sì");

    public void add(int i) {
        text = text + " " + d.get(i);
    }

    public void printText() {
        System.out.println(text);
    }
}
