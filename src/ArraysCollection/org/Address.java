package ArraysCollection.org;

public class Address implements Comparable<Address> {
    private String name;
    private int rollno;
    private String address;
    public Address(){}
    public Address(String name, int rollno, String address){
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Address o) {
//        if (!(this.name.equals(o.name))) {
//            return -1;
//        }
        return this.name.compareTo(o.name);
    }
}
