//Adaptee
public class LabelServer {
    private int labelNum = 1;
    private String labelPrefix;

    public LabelServer(String prefix) {
        labelPrefix = prefix;
    }

    public String serverNextLabel() {
        return labelPrefix + labelNum++;
    }
}
