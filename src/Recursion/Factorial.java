package Recursion;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        scn.close();
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact = factorial(n-1);
        int ans = n*fact;
        return ans;
    }
}
