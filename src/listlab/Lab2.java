package listlab;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {

    private String lastName;
    private String firstName;
    private String ssn;

    public Lab2(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + ssn;
    }

    public static void main(String[] args) {
        Lab2 e1 = new Lab2("Duwe", "Thomas", "123-45-6789");
        Lab2 e2 = new Lab2("Duwe", "Jessica", "987-65-4321");
        Lab2 e3 = new Lab2("Duwe", "Nova", "000-00-0000");

        List <String> emps = new ArrayList<>();
        emps.add(e1.toString());
        emps.add(e2.toString());
        emps.add(e3.toString());

        for (String item : emps) {
            System.out.println(item);
        }

    }

}
