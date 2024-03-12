package opps.com.has;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch (n){
            case 1:
                System.out.println("10");
                break;
            case 2:
                System.out.println("30");
                break;
            default:
                System.out.println("Apna kaam kar");
        }
       scn.close();
    }
}
