package opps.com.has;

public class Employee {
    int code;
    String Name;
    String Section;
    Address address;

    public Employee(int code, String name, String section, Address address) {
        this.code = code;
        this.Name = name;
        this.Section = section;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", Name='" + Name + '\'' +
                ", Section='" + Section + '\'' +
                '}';
    }
}
