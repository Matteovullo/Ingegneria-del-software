public class Fat implements Filesistem{
    private int x=100;

    public void tipo(){
        System.out.println("FAT"); 
    }

    public void memoriaoccupata(){
        System.out.println("memoria occupata:");
        System.out.println(x);
    }

    public void use(){
        x--;
    }
}
