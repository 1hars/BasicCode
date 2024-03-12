import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int temp = x;
        int sum = 0;
        if(x > 0) {
            while (x != 0) {
                int var = x % 10;
                sum = (sum * 10) + var;
                x = x / 10;
            }
        }
        if(temp == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
