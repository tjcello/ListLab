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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.rabiesId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lab3 other = (Lab3) obj;
        if (this.rabiesId != other.rabiesId) {
            return false;
        }
        return true;
    }
    
    

    public static void main(String[] args) {
        Lab3 dog1 = new Lab3("Nova", 12345);
        Lab3 dog2 = new Lab3("Dante", 23456);
        Lab3 dog3 = new Lab3("Mogli", 34567);
        Lab2 person1 = new Lab2("Duwe", "Thomas", "999-99-9999");
        Lab2 person2 = new Lab2("Duwe", "Jessica", "000-00-0000");
        Lab2 person3 = new Lab2("Duwe", "Paula", "111-11-1111");

        List info = new ArrayList();
        info.add(dog1);
        info.add(dog2);
        info.add(dog3);
        info.add(person1);
        info.add(person2);
        info.add(person3);

        

        for (Object o : info) {

            if (o instanceof Lab2) {
                Lab2 e = (Lab2) o;
                System.out.println(e);
            } else if (o instanceof Lab3) {
                Lab3 d = (Lab3) o;
                System.out.println(d);
            }

        }

    }
}
