package Recursion;
import java.util.Scanner;
public class ZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        zigzig(n);
        scn.close();
    }
    public static void zigzig(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+"\t");
        zigzig(n-1);
        System.out.print(n+"\t");
        zigzig(n-1);
        System.out.print(n+"\t");
    }
}
