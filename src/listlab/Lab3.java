/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return name + " with Rabies Id number " + rabiesId;
    }

    public static void main(String[] args) {
        Lab3 dog1 = new Lab3("Nova", 12345);
        Lab3 dog2 = new Lab3("Dante", 23456);
        Lab3 dog3 = new Lab3("Mogli", 34567);
        
        List doggies = new ArrayList();
        doggies.add(dog1.toString());
        doggies.add(dog2.toString());
        doggies.add(dog3.toString());

        Lab2 person1 = new Lab2("Duwe", "Thomas", "999-99-9999");
        Lab2 person2 = new Lab2("Duwe", "Jessica", "000-00-0000");
        Lab2 person3 = new Lab2("Duwe", "Paula", "111-11-1111");
        
        List persons = new ArrayList();
        persons.add(person1.toString());
        persons.add(person2.toString());
        persons.add(person3.toString());
        
        for (int i=0; i < doggies.size() && i < persons.size(); i++){
            String dogs = (String)doggies.get(i);
            String peeps = (String)persons.get(i);
        
            System.out.println("The owner of " + dogs + " is " + peeps);
        
        }
    }
}
