package Started;
import java.util.Scanner;
public class Inverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pos = 1;
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            int temp = (int)Math.pow(10,digit-1);
            sum = sum+(pos*temp);
            pos++;
            n = n/10;
        }
        System.out.println(sum);
    }
}
