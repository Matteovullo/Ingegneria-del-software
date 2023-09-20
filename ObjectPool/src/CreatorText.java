import java.util.ArrayList;
import java.util.List;

public class CreatorText {
    private static List<TextEditor> pool = new ArrayList<>();

    public static TextEditor getEng(){
        System.out.println("Crea un text editor con english");
        return new TextEditor(new spCheckEnglish());
    }

    public static TextEditor getIta(){
        System.out.println("Crea un texteditor con italian");
        return new TextEditor(new spCheckItalian());
    }

    public static TextEditor getFromPool(){
        if(!pool.isEmpty()) return pool.remove(0);
        return new TextEditor(new spCheckEnglish());
    }

    public static void release(TextEditor t){
        pool.add(t);
    }
}
