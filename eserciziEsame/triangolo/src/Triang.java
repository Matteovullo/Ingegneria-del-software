public record Triang(int lato1,int lato2,int lato3,int ang1,int ang2,int ang3){

    public String stampa(){
        return ("lati triangolo :" + lato1 + " " +" "+ lato2+ " " + lato3);
    }
    
    public String getBase(){
        if(lato1 == lato2){
            return ("la base è :" +lato3);
        }
        if(lato2 == lato3){
            return ("la base è : "+ lato1);
        }
        if(lato3 == lato1){
            return ("la base è : " + lato2);
        }
        return ("Il triangolo non è isoscele ");
    }

    public int getLato1(){return lato1;}
    public int getLato2(){return lato2;}
    public int getLato3(){return lato3;}
}

