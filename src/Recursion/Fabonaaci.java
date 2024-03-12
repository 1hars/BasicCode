package Recursion;
import java.util.Scanner;
public class Fabonaaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fabo(n,0,1);
        scn.close();
    }
    public static void fabo(int n, int first, int second){
        if(n==0){
            return;
        }
        System.out.print(first+"\t");
        int temp = first+second;
        first = second;
        second = temp;
        fabo(n-1,first,second);

    }
}
