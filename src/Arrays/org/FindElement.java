package Arrays.org;
import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter value of element");
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println("Enetr find Element");
        int ele = scn.nextInt();
        int ans = findelement(arr,ele);
        System.out.println("Answer is ----");
        System.out.println(ans);
        scn.close();
    }
    public static int findelement(int arr[], int ele){
        for(int i = 0; i < arr.length;  i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
}
