package Recursion.Arrayswith;
import java.util.Scanner;
public class ArrayInReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int idx = arr.length-1;
        printReverse(arr,idx);
        scn.close();
    }
    public static void printReverse(int arr[], int idx){
        if(idx < 0){
            return;
        }
        System.out.print(arr[idx]+"\t");
        printReverse(arr,idx-1);

    }
}
