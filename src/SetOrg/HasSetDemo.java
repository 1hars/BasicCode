package SetOrg;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {

    public HashSet<Student> getAllData(){
        Student s1 = new Student("Ravindra",1,99099099);
        Student s2 = new Student("Mahindra",2,67894734);
        Student s3 = new Student("Bhumika",3,99099088);
        Student s4 = new Student("Mahindra",4,67894372);
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        return hashSet;

    }
    public void displayNameandRoll(HashSet<Student> hashSet){
        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName()+"  "+ student.getRollno());
        }

    }
    public HashSet<Student> removeBasedRoll(HashSet<Student> hashSet, int roll){
        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getRollno()==roll){
                iterator.remove();
            }
        }
        return hashSet;
    }
    public static void main(String[] args) {
        HasSetDemo demo = new HasSetDemo();
        HashSet<Student> students = demo.getAllData();
        System.out.println(students);
        demo.displayNameandRoll(students);
        HashSet<Student> data = demo.removeBasedRoll(students,2);
        System.out.println(data);
    }
}
