package ArraysCollection.org;

import java.util.ArrayList;
import java.util.List;
public class Implement {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(1,50);
        System.out.println(list);
        System.out.println("The index of "+list.indexOf(2));
        list.set(1,2.5f);
        list.add(45);
        list.add("JavaApplication");
        list.add("Python");
        for(Object object: list){
            System.out.println(object );
        }

    }
}
