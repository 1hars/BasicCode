package Recursion;
import java.util.Scanner;
public class PrintDecrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printdecrease(n);
        scn.close();
    }
    public static void printdecrease(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printdecrease(n-1);
    }
}
