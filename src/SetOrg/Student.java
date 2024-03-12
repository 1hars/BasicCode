package SetOrg;

public class Student {
    private String name;
    private int rollno;
    private int mobile;

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

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Student(String name, int rollno, int mobile) {
        this.name = name;
        this.rollno = rollno;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", mobile=" + mobile +
                '}';
    }
}
