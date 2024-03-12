package UserDefined;

import java.util.ArrayList;
import java.util.List;

public class Userdef {
    public static void main(String[] args) {
        List<Address> list = new ArrayList<>();
        list.add(new Address(1,"Ankit",'A'));
        list.add(new Address(2,"Ankit",'B'));
        System.out.println(list);
    }
}
