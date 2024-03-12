package ArraysCollection.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class AddressImp {
    public static void main(String[] args) {
        List<Address> list = Arrays.asList(
            new Address("Rajiv",1,"Meerut Ghantaghar"),
            new Address("Ritik Roshan", 2, "Mumbai"),
            new Address("Akshay Kuamr",3,"Mumbai")
        );
        Collections.sort(list);
        for(Address list1: list){
            System.out.println(list1);
        }

    }
}
