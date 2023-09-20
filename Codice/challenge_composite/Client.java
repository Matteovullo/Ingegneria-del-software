public class Client {
    public static void main(String[] args){
        Fat f=new Fat();
        Tabelladirectory td=new Tabelladirectory();
        Tabellapartizioni tp=new Tabellapartizioni();
        Composite fs=new Composite();

        f.tipo();
        td.tipo();
        tp.tipo();
        f.memoriaoccupata();
        f.use();
        f.memoriaoccupata();
        fs.add(fs);
        fs.remove(fs);
    }
}
