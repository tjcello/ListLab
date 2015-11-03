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


    
    

    public static void main(String[] args) {
        Dog dog1 = new Dog("Nova", 12345);
        Dog dog2 = new Dog("Dante", 23456);
        Dog dog3 = new Dog("Mogli", 34567);
        Employee person1 = new Employee("Duwe", "Thomas", "999-99-9999");
        Employee person2 = new Employee("Duwe", "Jessica", "000-00-0000");
        Employee person3 = new Employee("Duwe", "Paula", "111-11-1111");

        List info = new ArrayList();
        info.add(dog1);
        info.add(dog2);
        info.add(dog3);
        info.add(person1);
        info.add(person2);
        info.add(person3);

        

        for (Object o : info) {

            if (o instanceof Employee) {
                Lab2 e = (Lab2) o;
                System.out.println(e);
            } else if (o instanceof Dog) {
                Lab3 d = (Lab3) o;
                System.out.println(d);
            }

        }

    }
}
