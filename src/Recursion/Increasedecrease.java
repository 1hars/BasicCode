package Recursion;
import java.util.Scanner;
public class Increasedecrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        increasedec(n);
    }
    public static void increasedec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+"\t");
        increasedec(n-1);
        System.out.print(n+"\t");
    }
}
