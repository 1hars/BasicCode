package Arrays.org;
import java.util.Scanner;
public class SpanElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        int mininum = min(arr);
        int maximum = max(arr);
        int span = maximum-mininum;
        System.out.println("The answer is "+span);
        scn.close();
    }
    public static int max(int arr[]){
        int maxnum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }
    public static int min(int arr[]){
        int minnum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minnum){
                minnum = arr[i];
            }
        }
        return minnum;
    }
}
