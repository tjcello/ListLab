/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author tduwe
 */
public class Lab3 {
    private String name;
    private int rabiesId;

    public Lab3() {
    }

    public Lab3(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    
    
    public static void main(String[] args) {
        Lab2 l = new Lab2("Duwe", "Thomas", "999-99-9999");
        System.out.println(l);
    }
}
