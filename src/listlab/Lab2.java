package listlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab2 {

    
    
    
    

    public static void main(String[] args) {
        Employee e1 = new Employee("Duwe", "Thomas", "123-45-6789");
        Employee e2 = new Employee("Duwe", "Jessica", "987-65-4321");
        Employee e3 = new Employee("Duwe", "Nova", "000-00-0000");

        List <Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        for (Employee item : emps) {
            System.out.println(item);
        }

    }

}
