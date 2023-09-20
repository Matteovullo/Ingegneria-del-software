public class TextEditor{
    private spCheck speller;

    public TextEditor(spCheck sp){
        speller = sp;
    }

    public void put(String word){
        if(speller.check(word)) System.out.println("lingua usata OK");
        else System.out.println("lingua usata NON OK ");
    }
}