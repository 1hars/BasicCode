package Recursion;
import java.util.Scanner;
public class Powerlinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powerlinear(x,n);
        System.out.println(ans);
        scn.close();
    }
    public static int powerlinear(int x,int n){
        if(n==0){
            return 1;
        }
        int pow1 = powerlinear(x, n-1);
        int ans = x*pow1;
        return ans;
    }
}
