public class Client{
    public static void main(String[] arg){
        Handler h1=new Registrazione();
        Handler h2=new Login();
        Handler h3=new Cancellazione();
        
        h1.request("matteo", "miao");
        h2.request("matteo", "miao");
        h3.request("matteo", "miao");
    }
}