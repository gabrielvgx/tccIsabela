/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tccisabela;


public class Item {
    private int id;
    private String desc;
    private String action;
    private int fkid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getFkid() {
        return fkid;
    }

    public void setFkid(int fkid) {
        this.fkid = fkid;
    }
    
    public void mostrarItem(){
        System.out.println("id_item: "+id+"\ndesc_item: "+desc
                +"\nactionitem: "+action+"\nfk_id_item: "+fkid);
    }
}
