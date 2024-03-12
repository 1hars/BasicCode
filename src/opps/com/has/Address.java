package opps.com.has;

public class Address {
    int streetno;
    String Street;
    String City;

    Address(int streetno, String Street, String City){
        this.streetno = streetno;
        this.Street = Street;
        this.City = City;
    }
//    public void toString{
//
//    }

    @Override
    public String toString() {
        return "Address{" +
                "streetno=" + streetno +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
