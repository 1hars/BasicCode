package opps.com;

public class Encapsulation {
    private static int id;

//    public void setId(int id){
//        this.id = id;
//    }
//    public int getId(){
//        return id;
//    }
    public Encapsulation(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        Encapsulation ep = new Encapsulation(10);
        Encapsulation ep1 = new Encapsulation(20);

        System.out.println(ep.id);
        System.out.println(ep1.id);

    }
}
