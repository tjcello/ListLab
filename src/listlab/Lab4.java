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
        Employee e1 = new Employee("Duwe", "Thomas", "123-45-6789");
        Employee e2 = new Employee("Duwe", "Jessica", "987-65-4321");
        Employee e3 = new Employee("Duwe", "Nova", "000-00-0000");
        Employee e4 = new Employee("Duwe", "Thomas", "123-45-6789");
        
        Set <Employee> emps = new HashSet<>();
        
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        
        List <Employee> eList = new ArrayList<>(emps);
        
        for (Employee e : eList){
            System.out.println(e);
        }
        
    }
}
