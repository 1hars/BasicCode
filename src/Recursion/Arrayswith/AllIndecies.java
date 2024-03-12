package Recursion.Arrayswith;
import java.util.Scanner;
public class AllIndecies {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans[] = allfound(arr,x,0,0);
        for(int i : ans){
            System.out.print(i+"\t");
        }
        scn.close();
    }
    public static int[] allfound(int arr[], int x, int idx, int size){
        if(idx == arr.length){
            int base[] = new int[size];
            return base;
        }
        if(arr[idx] == x){
            size = size+1;
        }
        int ans[] = allfound(arr,x,idx+1, size); // new int[size]
        if(arr[idx] == x){
            ans[size-1] = idx;
        }
        return ans;
    }
}
