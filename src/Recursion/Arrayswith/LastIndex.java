package Recursion.Arrayswith;
import java.util.Scanner;
public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = lastIndex(arr,x,arr.length-1);
        System.out.println(ans);
        scn.nextInt();
    }
    public static int lastIndex(int arr[], int x,int idx){
        if(idx < 0){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            return lastIndex(arr,x,idx-1);
        }
    }
}
