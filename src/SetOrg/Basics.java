package SetOrg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Basics {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Rishav");
        set.add("Muradnagar");
        set.add("Shaibabad");
        System.out.println(set.size());
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Rajveer");
        hashset.add("Anghori");
        System.out.println(hashset);
        Iterator<String> iterator = hashset.iterator();
//        for(String str  iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
