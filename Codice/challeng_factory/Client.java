package challeng_factory;

public class Client {
    public static void main(String[] arg){
        Figuracreator fc=new Figuracreator();
        Figura f=fc.getFigura(3);
        f.takeinformation();
        f=fc.getFigura(4);
        f.takeinformation();
        f=fc.getFigura(6);
        f.takeinformation();
    }
}
