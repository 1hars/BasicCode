package Map.org;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Roshan");
        map.put(2,"Ruchin");
        map.put(3,"Avanish");
        map.put(4,"Rohit");
        System.out.println(map.containsKey(2));
      //  System.out.println(map.firstKey());
        System.out.println(map.entrySet());
        System.out.println("Keys"+" "+"Values");
        for(Map.Entry<Integer,String> entery : map.entrySet()){
            System.out.println(entery.getKey()+"\t"+entery.getValue());
        }
    }
}
