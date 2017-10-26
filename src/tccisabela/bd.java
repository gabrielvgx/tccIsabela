package tccisabela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class bd {
   
    public static void carregarDadosTeste() throws ClassNotFoundException, SQLException{
        Connection connection = ConnectionManager.getInstance().getConnection();
        String sql = "INSERT INTO item (id_item, desc_item, fk_id_item) VALUES (?,?,?)";
        PreparedStatement p = connection.prepareStatement(sql);
       if(getItems() == null){
        p.setInt(1, 1);
        p.setString(2, "Eletrica");
        p.setInt(3, 1);
        p.execute();
       
        p = connection.prepareStatement(sql);
        p.setInt(1, 2);
        p.setString(2, "Hidraulica");
        p.setInt(3, 2);
        p.execute();
        
        p = connection.prepareStatement(sql);
        p.setInt(1, 3);
        p.setString(2, "Pneu");
        p.setInt(3, 3);
        p.execute();
        
        p = connection.prepareStatement(sql);
        p.setInt(1, 4);
        p.setString(2, "Pouca agua");
        p.setInt(3, 2);
        p.execute();
        
        p = connection.prepareStatement(sql);
        p.setInt(1, 5);
        p.setString(2, "Circuito");
        p.setInt(3, 1);
        p.execute();
        
        p = connection.prepareStatement(sql);
        p.setInt(1, 6);
        p.setString(2, "Circuito mal-funcionamento");
        p.setInt(3, 5);
        p.execute();
       }
    }
    public static ArrayList<Item> getItems() throws SQLException, ClassNotFoundException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM item ORDER BY id_item";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Item> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Item item = new Item();
                    item.setId(rs.getInt("id_item"));
                    item.setDesc(rs.getString("desc_item"));
                    item.setAction(rs.getString("actionitem"));
                    item.setFkid(rs.getInt("fk_id_item"));
                    listAll.add(item);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void addAction(int id, String action) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionManager.getInstance().getConnection();
        String sql = "UPDATE item actionitem SET actionitem = ? WHERE id_item = ?";
      
          
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, action);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        pstmt.close();
        connection.close();
    }

}
