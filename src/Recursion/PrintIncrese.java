package Recursion;
import java.util.Scanner;
public class PrintIncrese {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncrease(n);
        scn.close();
    }
    public static void printIncrease(int n){
        if(n==0){
            return;
        }
        printIncrease(n-1);
        System.out.print(n+"\t");
    }
}
