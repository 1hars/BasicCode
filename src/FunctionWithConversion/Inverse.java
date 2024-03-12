package FunctionWithConversion;
import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        int ans[] = inverse(arr);
        for(int solu : ans){
            System.out.println(solu);
        }
        scn.close();
    }
    public static int[] inverse(int arr[]){
        int ans[] = new int[arr.length];
        for(int idx = 0; idx < arr.length; idx++){
            int ele = arr[idx];
            ans[ele] = idx;
        }
        return ans;
    }
}
