package Arrays.org;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Length for n1");
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Length for n2");
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        System.out.println("Answer is ");
        int ans[] = sum(arr1, arr2);

        for (int val : ans) {
            System.out.print(val+"\t");
        }
        scn.close();
    }

    public static int[] sum(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = Math.max(n1,n2);
        int carry = 0;
        int ans[] = new int[n3];
        int v1 = n1-1;
        int v2 = n2-1;
        int v3 = n3-1;
        while(v1 >= 0 || v2 >= 0){
            int var1 = v1 >= 0 ? arr1[v1] : 0;
            int var2 = v2 >= 0 ? arr2[v2] : 0;

            int sum = var1+var2+carry;
            int digit = sum%10;
            carry = sum/10;
            ans[v3] = digit;
            v1--;
            v2--;
            v3--;
        }
        if(carry != 0){
            int newans[] = new int[ans.length+1];
            newans[0] = carry;
            for(int i = 1; i < newans.length; i++){
                newans[i] = ans[i-1];
            }
            return newans;
        }
        return ans;
    }
}
