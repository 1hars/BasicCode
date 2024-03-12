package Started;
import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int on = n;
        int temp = 1;
        while(on > 9) {
            on = on / 10;
            temp = temp * 10;
        }
        while(n != 0){
            int temp1 = n/temp;
            System.out.println(temp1);
            n = n%temp;
            temp = temp/10;
        }
    }
}
