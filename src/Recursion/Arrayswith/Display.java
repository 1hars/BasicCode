package Recursion.Arrayswith;
import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int idx = arr.length-1;
        printarray(arr,idx);
        scn.close();
    }
    public static void printarray(int arr[],int idx){
        if(idx < 0){
            return;
        }
        printarray(arr,idx-1);
        System.out.print(arr[idx]+"\t");
    }
}
