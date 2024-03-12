package UserDefined;

public class Address {
    private int roolno;
    private String name;
    private char ch;

    public Address(int roolno, String name, char ch) {
        this.roolno = roolno;
        this.name = name;
        this.ch = ch;
    }

    public int getRoolno() {
        return roolno;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Address{" +
                "roolno=" + roolno +
                ", name='" + name + '\'' +
                ", ch=" + ch +
                '}';
    }
}
