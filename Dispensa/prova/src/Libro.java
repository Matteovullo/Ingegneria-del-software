public class Libro{
    private String nome, genere, ID;
    private Double prezzo;
    private Integer disponibilita;

    Libro (String nome, String genere, double prezzo)
    {
        this.nome=nome;
        this.genere=genere;
        this.prezzo=prezzo;
        disponibilita=10;
        ID = createID(nome);
    }
    Libro (String nome, String genere, double prezzo,Integer disponibilita)
    {
        this.nome=nome;
        this.ID= createID(nome);
        this.genere=genere;
        this.prezzo=prezzo;
        this.disponibilita=disponibilita;
    }

    private String createID (String nome)
    {
        String id = (nome.substring(0, 4)).toUpperCase();
        return id;
    }



    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getGenere()
    {
        return genere;
    }

    public void setGenere(String genere)
    {
        this.genere = genere;
    }
    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public double getPrezzo()
    {
        return prezzo;
    }

    public void modificaPrezzo(Double prezzo)
    {
        this.prezzo = prezzo;
    }
    public void sconto(double percentuale)
    {
        if(percentuale < 0.0 || percentuale > 100.0 ){
            System.out.println("\nCOGLIONE SEI UN malato\n");
        }
        prezzo -= ( prezzo* percentuale )/100;
    }

    public void aumentaDisp(int aumento){
        disponibilita += aumento;
    }

    public void preleva(int quantita)
    {
        disponibilita -= quantita;
    }

    public Integer getDisponibilita()
    {
        return disponibilita;
    }

    public void setdisponibilita(Integer disponibilita)
    {
        this.disponibilita = disponibilita;
    }

    public void printAll()
    {
        System.out.println("nome = " + nome);
        System.out.println("genere = " + genere);
        System.out.println("ID = " + ID);
        System.out.println("prezzo = " + prezzo);
        System.out.println("disponibilita = " + disponibilita);
        System.out.println("\n");
    }
    
}   
