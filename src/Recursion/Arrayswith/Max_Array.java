package Recursion.Arrayswith;
import java.util.Scanner;
public class Max_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = max(arr,arr.length-1);
        System.out.println(ans);
    }
    public static int max(int arr[], int idx){
        if(idx < 0){
            return 0;
        }
        int  var = max(arr,idx-1);
        if(arr[idx] > var){
            var = arr[idx];
        }
        return var;
    }
}