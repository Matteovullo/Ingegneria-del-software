public class ConcreteMessaggio extends Messaggio{
    /*private String subjectState="Consegnato";

    public String getState(){
        return subjectState;
    }

    public void setState(){
        if(subjectState.equals("Ricevuto")) subjectState="Consegnato"; 
        else subjectState="Ricevuto";
    }*/

    public void change(){
        setChange();
        //notify(getClass());
    }
}
