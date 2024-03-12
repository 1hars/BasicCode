package FunctionWithConversion;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        inverse(arr);
//        int ans[] = inverse(arr);
//        for(int valu : ans){
//            System.out.println(valu);
//        }
        scn.close();
    }
    public static void inverse(int[] arr){
//        int ans[] = new int[arr.length];
//        int idx = ans.length-1;
//        for(int i = 0; i < ans.length; i++){
//            int temp = arr[idx];
//            ans[i] = temp;
//            idx--;
//        }
//        return ans;
        int low = 0, high = arr.length-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
