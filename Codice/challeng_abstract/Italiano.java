package challeng_abstract;

import java.util.*;

public class Italiano implements Lingua{
    private static String[] menu={"Pasta con vongole", "Pasta alla pescatore",
    "Cozze in crosta", "Gamberi", "Frittura mista","Risotto", "Bistecca",
    "Pasta alla boscaiola", "Carne di cavaddu", "Salsiccia"};

    private List<String> menuList = Arrays.asList(menu);

    public void getPiatto(int j){
        for(int i=0; i<menuList.size(); i++){
            if(j==i){
                System.out.println(menuList.get(i));
            }
        }
    }
}
