import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Tochecklist {
    public static void main(String[] args){
        List l = new ArrayList();
//        List l1 = new LinkedList();
//        List l2 = new Vector();
        l.add(10);
        l.add(20);
        l.add("Ankur");
        l.add(2,"Amit");
        System.out.println(l);
        l.set(1,30);
        System.out.println(l);
        System.out.println(l.get(1));
        System.out.println(l.indexOf("Ankur"));
        System.out.println(l.size());


//        l.indexOf((30);
//        l.remove(0);
    }
}
