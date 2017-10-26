package tccisabela;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        bd.carregarDadosTeste();
        ArrayList<Item> items = bd.getItems();
        for (Item i : items) {
            i.mostrarItem();
            System.out.println();
            
        }
        System.out.println("----------------");
        System.out.println("Possui Filhos: \n");
        for (Item i : items) {
            
            if (recurso.possuiFilhos(i, items)) {
                bd.addAction(i.getId(), "scroll");
                System.out.println("id: "+i.getId()+"\nDesc: "+i.getDesc());
            }else{
                bd.addAction(i.getId(), "onClick");
            }
        }
        
    }
    
}
