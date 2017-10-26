package tccisabela;

import java.util.ArrayList;

public class recurso {
    public static boolean possuiFilhos(Item i, ArrayList<Item> total){
        for(Item j : total){
            if (i.getId() == j.getFkid() && i.getId() != j.getId()){
                return true;
            }
        }
        return false;
    }
}
