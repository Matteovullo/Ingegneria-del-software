import java.util.*;

public class DrawingComposite implements Drawable{
    
    List<Drawable> drawables = new ArrayList<>();

    public void add(Drawable obj) {
        drawables.add(obj);
    }

    @Override
    public void draw() {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
