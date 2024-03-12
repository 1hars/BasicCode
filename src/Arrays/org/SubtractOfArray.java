package Arrays.org;
import java.util.Scanner;
public class SubtractOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int idx = 0; idx < arr1.length; idx++){
            arr1[idx] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int idx = 0; idx < arr2.length; idx++){
            arr2[idx] = scn.nextInt();
        }
        subtract(arr1,arr2);
    }
    public static void subtract(int arr1[], int arr2[]){

        int v1 = arr1.length-1;
        int v2 = arr2.length-1;
        int k = Math.max(v1,v2);
        int ans[] = new int[k+1];
        int b = 0;
        while(k <= 0){
            int ele1 = arr1[v1]+b;
            int ele2 = arr2[v2];
            int eleans = 0;
            if(ele1 < ele2){
                eleans = ele1+10-ele2;
                b = -1;
            }else{
                eleans = ele1-ele2;
                b = 0;
            }
            ans[k] = eleans;
            k--;
            v1--;
            v2--;
        }
        for(int a: ans){
            System.out.println(a);
        }
        int idx = 0;
        while(idx < ans.length) {
            if (ans[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while(idx < ans.length){
            System.out.print(ans[idx]+"\t");
            idx++;
        }
    }
}
