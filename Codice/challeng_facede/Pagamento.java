package challeng_facede;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pagamento {
    private int IDconto;
    private double importo;
    private String data;

    public Pagamento(int _IDconto, double _importo){
        data=LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        IDconto=_IDconto;
        importo=_importo;
    }

    public int getID(){return IDconto;}
    public double getImporto(){return importo;}
    public String getData(){return data;}
}
