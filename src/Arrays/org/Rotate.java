package Arrays.org;
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k%arr.length;
        if(k < 0){
            k = k+arr.length;
        }
        rotate(arr,k);
    }
    public static void rotate(int arr[], int k){
        int v1 = 0;
        int v2 = arr.length-k-1;
        for(int i = 0; i < arr.length-k-1; i++){
            int temp = arr[v1];
            arr[v1] = arr[v2];
            arr[v2] = temp;
            v1++;
            v2--;
        }
        v1 = arr.length-k;
        v2 = arr.length;
        for(int i = 1; i < k; i++){
            int temp = arr[v1];
            arr[v1] = arr[v2];
            arr[v2] = temp;
            v1++;
            v2--;
        }
        v1 = 0;
        v2 = arr.length-1;
        while(v1 < v2){
            int temp = arr[v1];
            arr[v1] = arr[v2];
            arr[v2] = temp;
            v1++;
            v2--;
        }
        for(int ans : arr){
            System.out.print(ans+"\t");
        }
    }
}
