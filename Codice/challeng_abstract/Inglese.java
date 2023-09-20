package challeng_abstract;

import java.util.*;

public class Inglese implements Lingua{
    private static String[] menu={"Pasta with clams", "Pasta alla pescatore",
    "Mussels in crust", "Shrimps", "Mixed fry", "Risotto", "Steak",
    "Boscaiola pasta", "Cavaddu meat", "Salsiccia"};

    private List<String> menuList = Arrays.asList(menu);

    public void getPiatto(int j){
        for(int i=0; i<menuList.size(); i++){
            if(j==i){
                System.out.println(menuList.get(i));
            }
        }
    }
}
