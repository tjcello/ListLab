package listlab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Thomas
 */
public class Lab4 {
    public static void main(String[] args) {
        Lab2 e1 = new Lab2("Duwe", "Thomas", "123-45-6789");
        Lab2 e2 = new Lab2("Duwe", "Jessica", "987-65-4321");
        Lab2 e3 = new Lab2("Duwe", "Nova", "000-00-0000");
        Lab2 e4 = new Lab2("Duwe", "Thomas", "123-45-6789");
        
        Set <Lab2> emps = new HashSet<>();
        
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        
        List <Lab2> eList = new ArrayList<>(emps);
        
        for (Lab2 l : eList){
            System.out.println(l);
        }
        
    }
}
