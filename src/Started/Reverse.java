package Started;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0){
            int temp = n%10;
            System.out.println(temp);
            n = n/10;
        }
    }
}
