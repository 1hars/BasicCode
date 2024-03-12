package Recursion.Arrayswith;
import java.util.Scanner;
public class FirstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = firstIndex(arr,x,0);
        System.out.println(ans);
    }
    public static int firstIndex(int arr[], int x,int idx){
        if(idx == arr.length-1){
            return -1;
        }
        if(arr[idx] == x){
           // System.out.println(idx);
            return idx;
        }else {
            return firstIndex(arr, x, idx + 1);
        }
    }
}
