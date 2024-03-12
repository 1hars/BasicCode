package ArraysCollection.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsList {
    public static void main(String[] args){
        List<String> list = Arrays.asList(
            "Bhaskar","Avni","Riya","Tushar","Avanish","Akshat"
        );
        Collections.sort(list);
        //for(String str: list){
          //  System.out.println(str);
        //}
        System.out.println(list);
    }
}
