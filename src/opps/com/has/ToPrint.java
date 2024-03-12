package opps.com.has;
public class ToPrint {
    public static void main(String[] args) {
        Address address = new Address(1,"Govindpuram","Ghaziabad");
        Employee em = new Employee(44,"Gardien","A",address);
        System.out.println(em.toString());
        System.out.println(address.toString());
    }
}