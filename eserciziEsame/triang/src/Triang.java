public class Triang{
    private int l0,l1,l2;
    private int empty;

    public static void main (String[] args){
        System.out.println();
    }

    private static Triang[] t1 = new Triang[]{
        new Triang(13,33,40),
        new Triang(15,15,30),
        new Triang(30,30,13)
    };

    public Triang(int lato0,int lato1,int lato2){
        this.l0 = lato0;
        this.l1 = lato1;
        this.l2 = lato2;
    }


    public String isIsoscele(){
        if (l0 == l1 || l1 == l2 || l2 == l0){
            return "True";
        }
        return "False";
    }

    public Object getBase(){
        if(l0 == l1){
            return l2;
        }
        if(l1 == l2){
            return l0;
        }
        if(l2 == l0){
            return l1;
        }
        return empty;
    }



    public static Triang gen(){
        int i = (int) (Math.random()* t1.length);
        return t1[i];
    }
    public int getLato0(){return l0;}
    public int getLato1(){return l1;}
    public int getLato2(){return l2;}
}