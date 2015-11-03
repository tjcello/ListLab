package listlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tduwe
 */
public class Lab1 {

    public static void main(String[] args) {
        List hobbies = new ArrayList();
        hobbies.add("golf");
        hobbies.add("play games");
        hobbies.add("play with my dogs");

        for (int i = 0; i < hobbies.size(); i++) {
            String item = (String) hobbies.get(i);
            System.out.println("I like to " + item);
        }
    }
}
